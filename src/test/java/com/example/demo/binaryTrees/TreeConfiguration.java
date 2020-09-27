package com.example.demo.binaryTrees;

import com.example.demo.binarySearchTree.BinarySearchTree;
import com.example.demo.binaryTree.Node;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@TestConfiguration
public class TreeConfiguration {


	@Bean(name="tree1")
	public Node<Character> getTestTree1(){

		Node<Character> a = new Node<>('A');
		Node<Character> b = new Node<>('B');
		Node<Character> c = new Node<>('C');
		Node<Character> d = new Node<>('D');
		Node<Character> e = new Node<>('E');
		Node<Character> f = new Node<>('F');
		Node<Character> g = new Node<>('G');
		Node<Character> h = new Node<>('H');
		Node<Character> x = new Node<>('X');

		a.setLeftChild(b);
		a.setRightChild(c);
		b.setLeftChild(d);
		b.setRightChild(e);
		c.setLeftChild(f);
		c.setRightChild(g);
		d.setLeftChild(h);
		d.setRightChild(x);

		return a;

	}


	@Bean(name="binaryTree1")
	public BinarySearchTree<Integer> getBinaryTree1(){

		List<Integer> list = Arrays.asList(25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31, 44, 66, 90);
		return new BinarySearchTree<Integer>(list);

	}

}
