package com.example.demo.binaryTrees;


import com.example.demo.algorithms.BreadthFirstTraversal;
import com.example.demo.binaryTree.Node;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
@Import(TreeConfiguration.class)
public class BreadthFirstTraversalTest {


	@Autowired
	@Qualifier("tree1")
	Node<Character> testTree;


	@Test
	public void test() {

		List<Character> nodes = BreadthFirstTraversal.breadthFirst(testTree);
		System.out.println(nodes);
		List<Character> expected = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'X');
		assertThat(nodes, is(expected));

	}








}
