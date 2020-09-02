	public Node getNodeToBeDeleted(int data) {
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

	public void deleteIteratively(Node current, int data) {
		// current is the node to be deleted
		current = getNodeToBeDeleted(data);
		System.out.println("Data to be deleted is " + current.data);
		Node parent = getParent(current, data);
		if (parent != null)
			System.out.println("Parent of the node to be deleted is "
					+ parent.data);

		// Four cases of the node to be deleted...[0 child node,1 child node, 2
		// child nodes]
		if (current.left == null && current.right == null) {
			// Without parent, deleting normally is not possible.So update base
			// pointer i.e root only.
			if (parent == null)
				root = null;
			else if (parent.left != null && parent.left.data == current.data) {
				// parent node is set to null since the node to be deleted is a
				// leaf node
				parent.left = null;
			} else if (parent.right != null
					&& parent.right.data == current.data) {
				parent.right = null;
			}
			// When only Right Child is null.
		} else if (current.left != null && current.right == null) {
			// Without parent, deleting normally is not possible.So update base
			// pointer i.e root only.
			if (parent == null)
				root = current.left;
			// Check which of the children has to be removed.
			else if (parent.right != null && parent.right.data == current.data) {
				parent.right = current.left;
			} else if (parent.right != null && parent.left.data == current.data) {
				parent.left = current.left;
			}

			// When only Left Child is null.
		} else if (current.left == null && current.right != null) {
			// Without parent, deleting normally is not possible.So update base
			// pointer i.e root only.
			if (parent == null) {
				root = current.right;
			} else if (parent.left != null && parent.left.data == current.data) {
				parent.left = current.right;
			} else if (parent.right != null
					&& parent.right.data == current.data) {
				parent.right = current.right;
			}
			// Check if both children are null.
			// Then set current node value to its inorder successor, and delete
			// the inorder-successor.
		} else if (current.left != null && current.right != null) {
			Node successor = right_min(current.right);
			System.out.println("right minimum is " + successor.data);
			Node parent_of_min = getParent(successor, successor.data);
			if (parent_of_min != null)
				System.out.println("Parent of right subtree minimum is "
						+ parent_of_min.data);
			deleteIteratively(current.right, successor.data);
			current.data = successor.data;
		}
	}
	
	// Change Parent's left/right node to delete a node. 
	public Node getParent(Node current, int data) {
		Node temp = root;
		// When current and root node is same, then root node has no parent so
		// return null.
		if (current == root)
			return null;
		while (true) {
			if (temp.left != null && temp.left.data == data)
				return temp;
			else if (temp.right != null && temp.right.data == data)
				return temp;

			if (data < temp.data)
				temp = temp.left;
			else if (data > temp.data)
				temp = temp.right;
		}
	}
	
	// Inorder successor of given node.
	public Node right_min(Node delnode) {
		if (delnode.left != null) {
			delnode = right_min(delnode.left);
		}
		return delnode;
	}
