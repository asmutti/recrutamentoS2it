package questao9;

import org.junit.Test;

import junit.framework.Assert;



public class BinaryTreeTest {
	
	@Test
	public void nodeSumTest() {
		
		BinaryTree binaryTree = new BinaryTree();
		int expected = 10;
		binaryTree.setValor(2);
		
		
		BinaryTree binaryTreeLeft = new BinaryTree();
		binaryTreeLeft.setValor(4);
		
		BinaryTree binaryTreeRight = new BinaryTree();		
		binaryTreeRight.setValor(4);
		
		binaryTree.setLeft(binaryTreeLeft);
		binaryTree.setRight(binaryTreeRight);
		
		
		Assert.assertEquals(expected, binaryTree.nodeSum(binaryTree));
	}
}
