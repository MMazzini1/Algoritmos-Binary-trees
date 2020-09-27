package com.example.demo.algorithms;

import com.example.demo.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {


	public static <T> List<T> preOrder(Node<T> node){
		List<T> orderedNodes = new ArrayList<T>();
		return preOrderAux(node, orderedNodes);
	}

	public static <T> List<T> preOrderAux(Node<T> node, List<T> orderedNodes) {

		if (node == null) {
			return orderedNodes;
		}

		orderedNodes.add(node.getData());
		preOrderAux(node.getLeftChild(), orderedNodes);
		preOrderAux(node.getRightChild(), orderedNodes);
		return orderedNodes;
	}




}
