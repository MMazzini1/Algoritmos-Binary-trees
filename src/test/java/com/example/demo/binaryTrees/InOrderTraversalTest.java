package com.example.demo.binaryTrees;

import com.example.demo.algorithms.InOrderTraversal;
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
public class InOrderTraversalTest {


	@Autowired
	@Qualifier("tree1")
	Node<Character> testTree;

	@Test
	public void test() {

		List<Character> nodes = InOrderTraversal.inOrder(testTree);
		System.out.println(nodes);
		List<Character> expected = Arrays.asList('H', 'D', 'X', 'B','E','A', 'F', 'C', 'G');
		assertThat(nodes, is(expected));

	}





}
