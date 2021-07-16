import java.io.*;
import java.util.*;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class isBST {

	public static void inOrderPrint(Node root) {
		if(root == null) {return;}
		inOrderPrint(root.left);
		System.out.println(root.key);
		inOrderPrint(root.right);
	}
	
	static int lastSeen = Integer.MIN_VALUE;

	public static boolean isBST(Node root) {
		if(root == null) {return true;}
		
		if(!isBST(root.left)) {return false;}
		
		if(lastSeen >= root.key) { return false; }
		
		lastSeen = root.key;
		
		if(!isBST(root.right)) {return false;}
		
		return true;
	}

	public static void main(String args[]) {
		Node root1 = new Node(4);

		root1.left = new Node(2);
		root1.left.left = new Node(1);
		root1.left.right = new Node(3);

		root1.right = new Node(10);
		root1.right.left = new Node(8);
		root1.right.right = new Node(12);
		
		System.out.println(isBST(root1)); //true
		lastSeen = Integer.MIN_VALUE;
		
		Node root2 = new Node(4);

		root2.left = new Node(2);
		root2.left.left = new Node(1);
		root2.left.right = new Node(3);

		root2.right = new Node(10);
		root2.right.left = new Node(8);
		root2.right.right = new Node(1);
		
		System.out.println(isBST(root2)); //false
		lastSeen = Integer.MIN_VALUE;
		
		Node root3 = new Node(4);		
		System.out.println(isBST(root3)); //true
		lastSeen = Integer.MIN_VALUE;
		
		Node root4 = null;		
		System.out.println(isBST(root4)); //true
		
	}
}
