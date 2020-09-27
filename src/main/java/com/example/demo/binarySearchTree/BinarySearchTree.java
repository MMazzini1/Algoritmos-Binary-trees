package com.example.demo.binarySearchTree;

import com.example.demo.binaryTree.Node;

import java.util.List;

public class BinarySearchTree<T extends Comparable> {

	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	BinarySearchTree() {
		root = null;
	}

	void insert(T data) {
		root = insertAux(root, data);
	}

	Node insertAux(Node root, T data) {

		if (root == null) {
			//caso base, realizas la inserción del nuevo nodo
			root = new Node(data);
			return root;
		}

		if (data.compareTo(root.getData()) < 0)
			root.setLeftChild(insertAux(root.getLeftChild(), data));
		else if (data.compareTo(root.getData()) > 0) {
			root.setRightChild(insertAux(root.getRightChild(), data));
		}
		//else, no se admiten duplicados en un BST, x definición.

		/* Devolves el nodo sin modificar*/
		return root;
	}


	public Node<T> search(Node<T> root, T data) {
		return searchAux(root,data);
	}

	public Node<T> searchAux(Node<T> head, T data) {
		if (head == null) {
			return null;
		}
		
		if (head.getData().compareTo(data) == 0) {
			return head;
		}

		if (data.compareTo(head.getData()) < 0 ) {
			return searchAux(head.getLeftChild(), data);
		} else {
			return searchAux(head.getRightChild(), data);
		}
	}


	// constructor utilitario para obtener un BST a partir de una lista de numeros.
	public BinarySearchTree(List<T> list) {
		insertAll(list, this);
	}

	public BinarySearchTree insertAll(List<T> list, BinarySearchTree<T> newBinarySearchTree) {
		for (int i = 0; i < list.size(); i++) {
			newBinarySearchTree.insert(list.get(i));
		}
		return newBinarySearchTree;
	}


	

}