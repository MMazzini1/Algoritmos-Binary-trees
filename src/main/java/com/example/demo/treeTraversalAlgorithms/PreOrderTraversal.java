package com.example.demo.treeTraversalAlgorithms;

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
		preOrderAux(node.getLeft(), orderedNodes);
		preOrderAux(node.getRight(), orderedNodes);
		return orderedNodes;
	}




}
