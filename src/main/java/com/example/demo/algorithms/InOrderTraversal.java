package com.example.demo.algorithms;

import com.example.demo.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {


	public static <T> List<T> inOrder(Node<T> node){
		List<T> orderedNodes = new ArrayList<T>();
		return inOrderAux(node, orderedNodes);
	}

	public static <T> List<T> inOrderAux(Node<T> node, List<T> orderedNodes) {

		if (node == null) {
			return orderedNodes;
		}

		inOrderAux(node.getLeftChild(), orderedNodes);
		orderedNodes.add(node.getData());
		inOrderAux(node.getRightChild(), orderedNodes);
		return orderedNodes;
	}


}
