package com.bridgelabz.bst;

public class BSTRunner {

	public static void main(String[] args) {
		MyBST<Integer> myBst=new MyBST<>();
		myBst.addBst(56);
		myBst.addBst(30);
		myBst.addBst(70);
		myBst.bstInorder();
	}

}
