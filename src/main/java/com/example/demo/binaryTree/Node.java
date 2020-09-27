package com.example.demo.binaryTree;

public class Node<T> {


	public T data;
	public Node<T> left;  //para mayor comodidad en los algoritmos, hago estos atributos publicos.
	public Node<T> right;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}



}
