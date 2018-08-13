package questao9;

public class BinaryTree {
	private int valor;
	private BinaryTree left;
	private BinaryTree right;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public BinaryTree getLeft() {
		return left;
	}
	
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	
	public BinaryTree getRight() {
		return right;
	}
	
	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	/**
	 * Método que retorna a soma dos nós subsequentes.
	 */
	public int nodeSum(BinaryTree binaryTree) {
		
		if(binaryTree == null) {
			return 0;
		}
		
		//chamada recursiva.
		return binaryTree.getValor() + nodeSum(binaryTree.getLeft()) + nodeSum(binaryTree.getRight());
	}

}
