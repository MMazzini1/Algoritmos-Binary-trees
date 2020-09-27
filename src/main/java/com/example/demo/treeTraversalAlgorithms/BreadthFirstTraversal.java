package com.example.demo.treeTraversalAlgorithms;

import com.example.demo.binaryTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {

	public static <T> List<T> breadthFirst(Node<T> root)  {

		List<T> orderedNodes = new ArrayList<>();
		if (root == null) {
			return orderedNodes;
		}


		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);


		while (!queue.isEmpty()) {
			Node<T> node = queue.remove();
			orderedNodes.add(node.getData());
			Node<T> leftChild = node.getLeft();
			Node<T> rightChild = node.getRight();

			if (leftChild != null) {
				queue.add(leftChild);
			}
			if (rightChild != null) {
				queue.add(rightChild);
			}
		}

		return orderedNodes;



	}






}
