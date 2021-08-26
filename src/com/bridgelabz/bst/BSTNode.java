package com.bridgelabz.bst;

public class BSTNode<T extends Comparable> {

	T data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(T data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
