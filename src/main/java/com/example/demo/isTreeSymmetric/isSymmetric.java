package com.example.demo.isTreeSymmetric;

import com.example.demo.binaryTree.Node;

public class isSymmetric {

	/**
	 * El problema consiste en testear si un árbol binario es simétrico, es decir,
	 * si su subtree izquierdo es igual a su subtree derecho.
	 *
	 * La solución que implemento abajo
	 * consiste en testear igualdad nodo a nodo, comparando los subarboles de modo espejado.
	 *
	 *
	 */

	private static boolean isSymmetric(Node node){
		return equalsReflected(node.left, node.right);

	}

	private static boolean equalsReflected(Node left, Node right) {
		if (left == null && right == null) return true;
		else if (left != null && right != null){
			if (left.data != right.data) return false;
			else {
				return equalsReflected(left.left, right.right) && equalsReflected(left.right, right.left);
			}
		}else return false;
	}



}
