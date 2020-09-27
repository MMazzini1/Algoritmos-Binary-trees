package com.example.demo.computeSumOfLeafPaths;

import com.example.demo.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class ComputeSumOfLeafPaths {

	/**
	 * El problema consiste en computar todos los caminos que conducen a un nodo hoja comenzando
	 * desde el nodo root de un arbol. El resultado es una lista de listas con los distintos caminos.
	 *
	 */
	private static List<List<Integer>> sumOfLeafPaths(Node<Integer> node){

		if (node.left == null && node.right == null){
			//caso base, nodo hoja, devuelvo una lista<lista<nodo>>
			return listsOfLists(node);
		}
		List<List<Integer>> left = new ArrayList<List<Integer>>();
		List<List<Integer>> right = new ArrayList<List<Integer>>();
		if (node.left != null){
			left = sumOfLeafPaths(node.left);
		}
		if (node.right != null){
			right = sumOfLeafPaths(node.right);
		}

		//el paso recursivo consiste en, a todos los paths obtenidos (tanto a la izq. como a la der.)
		//sumarles el nodo actual que va a formar parte del path.
		List<List<Integer>> merged = mergeResults(left, right);
		append(merged, node.data);
		System.out.println("appended " + merged.toString());

		return merged;
	}

	private static void append(List<List<Integer>> merged, Integer data) {
		merged.stream().forEach( l -> l.add(0, data));

	}

	private static List<List<Integer>> mergeResults(List<List<Integer>> left, List<List<Integer>> right) {
		List<List<Integer>> result = new ArrayList<>();
		result.addAll(left);
		result.addAll(right);
		return result;

	}

	private static List<List<Integer>> listsOfLists(Node<Integer> node) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		list.get(0).add(node.data);
		return list;
	}


}
