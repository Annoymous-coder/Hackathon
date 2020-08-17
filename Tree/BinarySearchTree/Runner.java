package BinarySearchTree;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();
		
		tree.add(11);
		tree.add(18);
		tree.add(40);
		tree.add(3);
		tree.add(7);
		tree.add(9);
		tree.add(20);
		tree.add(17);
		tree.add(90);
		tree.add(50);
		tree.add(110);
		tree.add(200);
		tree.add(150);
		tree.add(95);
		tree.add(96);
		tree.add(97);
		tree.add(92);
		tree.add(93);
		
		tree.inOrder(tree.root);

		tree.delete(40);

		System.out.println();

		tree.inOrder(tree.root);

	}

}
