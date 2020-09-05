	// Get Inorder successor of the given node.	
	public Node right_min(Node delnode) {
		if (delnode.left != null) {
			delnode = right_min(delnode.left);
		}
		return delnode;
	}

	public Node deleteRecursively(Node node, int data) {
		if (node == null)
			return null;
		// Since left or right values will be changed.
		if (data < node.data) {
			node.left = deleteRecursively(node.left, data);
		} else if (data > node.data) {
			node.right = deleteRecursively(node.right, data);
		} else {
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null)
				return node.right;
			else if (node.right == null)
				return node.left;
			else if (node.left != null && node.right != null) {
				Node successor = right_min(node.right);
				System.out.println("Succ data is " + successor.data);
				node.data = successor.data;
				// node.right will be changed.
				node.right = deleteRecursively(node.right, successor.data);
			}
		}
		return node;
	}