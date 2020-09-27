package com.example.demo.binaryTrees;

import com.example.demo.treeTraversalAlgorithms.PreOrderTraversal;
import com.example.demo.binaryTree.Node;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
@Import(TreeConfiguration.class)
public class PreOrderTraversalTest {

	@Autowired
	@Qualifier("tree1")
	Node<Character> testTree;

	@Test
	public void test() {

		List<Character> nodes = PreOrderTraversal.preOrder(testTree);
		System.out.println(nodes);
		List<Character> expected = Arrays.asList('A', 'B', 'D', 'H','X','E', 'C', 'F', 'G');
		assertThat(nodes, is(expected));

	}



}
