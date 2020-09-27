package com.example.demo.binaryTrees;

import com.example.demo.treeTraversalAlgorithms.BreadthFirstTraversal;
import com.example.demo.binarySearchTree.BinarySearchTree;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
@Import(TreeConfiguration.class)
public class BinarySearchTreeTest {


	@Test
	public void test() {

		List<Integer> list = Arrays.asList(5,3,7,4,2,9,6);
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(list);
		List breadthFirst = BreadthFirstTraversal.breadthFirst(binarySearchTree.getRoot()); //ya testeado

		assertThat(breadthFirst, is(Arrays.asList(5,3,7,2,4,6,9)));

	}









}
