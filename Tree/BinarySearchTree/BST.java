package BinarySearchTree;

public class BST {
	Node root;
	Node current;

	public void add(int data) {
		Node node = new Node(data);

		if (root == null) {
			root = node;
		} else {
			current = root;

			while (true) {

				if (data < current.data) {
					if (current.left == null) {
						current.left = node;
						break;
					} else {
						current = current.left;
					}
				} else {
					if (current.right == null) {
						current.right = node;
						break;
					} else {
						current = current.right;
					}
				}
			}
		}
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}

	public Node getNode(int data) {
		current = root;
		while (true) {
			if (current.data == data)
				return current;
			else if (data > current.data)
				current = current.right;
			else if (data < current.data)
				current = current.left;
		}
	}

	public void delete(int data)
	{	
		// current is the node to be deleted
		current = getNode(data);
		System.out.println("Data to be deleted is " + current.data);
		Node parent = getParent(current, data);
		System.out.println("Parent of the node to be deleted is " + parent.data);
		
		// Four cases of the node to be deleted...[0 child node,1 child node, 2 child nodes]
		if(current.left == null && current.right == null)
		{	
			if(parent.left != null && parent.left.data == current.data)
			{	
				// parent node is set to null since the node to be deleted is a leaf node
				parent.left = null;
			}
			else if(parent.right != null && parent.right.data == current.data)
			{
				parent.right = null;
			}
		}
		else if(current.left != null && current.right == null)
		{	
			// Check which of the children has to be removed.
			if(parent.right != null && parent.right.data == current.data)
			{
				parent.right = current.left;
			}
			else if(parent.right != null && parent.left.data == current.data)
			{
				parent.left = current.left;
			}
		}
		else if(current.left == null && current.right != null)
		{
			if(parent.left != null && parent.left.data == current.data)
			{
				parent.left = current.right;
			}
			else if(parent.right != null && parent.right.data == current.data)
			{
				parent.right = current.right;
			}
		}
		else if(current.left != null && current.right != null)
		{	
			
			Node right_subtree_minimum = right_min(current.right);;
			System.out.println("right minimum is " + right_subtree_minimum.data);
	
			Node parent_of_min = getParent(right_subtree_minimum, right_subtree_minimum.data);
			if(parent_of_min != null)
				System.out.println("Parent of right subtree minimum is " + parent_of_min.data);
			
			current.data = right_subtree_minimum.data;
			
			// When the right minimum node is a leaf nodes [considering it shall always have right child without left child]
			if(parent_of_min.left != null && parent_of_min.left.data == current.data){
				System.out.println("1");
				// When minimum node is a leaf node, automatically min.right is null and its parent is set to null.
				// Above if case handles when min node has only right child.
				parent_of_min.left = right_subtree_minimum.right;
			}
			// When right-minimum is right next to the node to be deleted
			if(current.right == right_subtree_minimum)
			{
				current.right = right_subtree_minimum.right;
				right_subtree_minimum = null;
			}
			
			
			/*if(parent_of_min.right != null && parent_of_min.right.data == current.data){
				parent_of_min.right = null;
			}*/
			/*if(right_subtree_minimum.left == null && right_subtree_minimum.right != null)
			{	System.out.println("2");
				current.right = right_subtree_minimum.right;
				right_subtree_minimum = null;
			}*/
		}
	}
	
	public Node getParent(Node current, int data)
	{	
		Node temp = root;
		if(current == root)
			return null;
		while(true)
		{
			if(temp.left != null && temp.left.data == data)
				return temp;
			else if(temp.right != null && temp.right.data == data)
				return temp;
			
			if(data < temp.data)
				temp = temp.left;
			else if(data > temp.data)
				temp = temp.right;
		}
	}
	
	public Node right_min(Node delnode) {
		if (delnode.left != null) {
			delnode = right_min(delnode.left);
		}
		return delnode;
	}
}
