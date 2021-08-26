package com.bridgelabz.bst;

public class MyBST<T extends Comparable> {

	BSTNode root;

	public MyBST() {
		root = null;
	}

	public void addBst(T data) {
		root = addBstRecursive(root, data);

	}

	public void bstInorder() {
		inorderRec(root);
	}
	public void inorderRec(BSTNode root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}
	public BSTNode<T> addBstRecursive(BSTNode<T> root, T data) {
		if (root == null) {
			root = new BSTNode<>(data);
			return root;
		}
		int result = data.compareTo(root.data);
		if (result < 0) {
			root.left = addBstRecursive(root.left, data);
		} else {
			root.right = addBstRecursive(root.right, data);
		}
		return root;
	}
	
	
}
