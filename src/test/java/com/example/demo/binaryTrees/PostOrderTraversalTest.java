package com.example.demo.binaryTrees;

import com.example.demo.treeTraversalAlgorithms.PostOrderTraversal;
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
public class PostOrderTraversalTest {

	@Autowired
	@Qualifier("tree1")
	Node<Character> testTree;

	@Test
	public void test() {

		List<Character> nodes = PostOrderTraversal.postOrder(testTree);
		System.out.println(nodes);
		List<Character> expected = Arrays.asList('H', 'X', 'D', 'E','B','F', 'G', 'C', 'A');
		assertThat(nodes, is(expected));



	}








}
