package com.example.demo.algorithms;

import com.example.demo.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

	public static <T> List<T> postOrder(Node<T> node){
		List<T> orderedNodes = new ArrayList<T>();
		return postOrderAux(node, orderedNodes);
	}

	public static <T> List<T> postOrderAux(Node<T> node, List<T> orderedNodes) {

		if (node == null) {
			return orderedNodes;
		}

		postOrderAux(node.getLeftChild(), orderedNodes);
		postOrderAux(node.getRightChild(), orderedNodes);
		orderedNodes.add(node.getData());
		return orderedNodes;
	}



}
