package com.bridgelabz.bst;

public class BSTRunner {

	public static void main(String[] args) {
		MyBST<Integer> myBst=new MyBST<>();
		myBst.addBst(56);
		myBst.addBst(30);
		myBst.addBst(70);
		myBst.addBst(22);
		myBst.addBst(40);
		myBst.addBst(60);
		myBst.addBst(95);
		myBst.addBst(11);
		myBst.addBst(65);
		myBst.addBst(3);
		myBst.addBst(18);
		myBst.addBst(63);
		myBst.addBst(67);
		myBst.bstInorder();
		int size=myBst.getSize();
		System.out.println("\r\n"+size);
		
		boolean result=myBst.search(63);
		if(result) {
		System.out.println("element is present");
		}else {
			System.out.println("element is not present");
		}
	}

}