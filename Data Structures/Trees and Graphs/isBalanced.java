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

class isBalanced {

	public static void inOrderPrint(Node root) {
		if(root == null) {return;}
		inOrderPrint(root.left);
		System.out.println(root.key);
		inOrderPrint(root.right);
	}

	public static boolean isBalanced(Node root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	}
	
	public static int checkHeight(Node root) {
		if(root == null) {return -1;}
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight == Integer.MIN_VALUE) {return Integer.MIN_VALUE;}
		
		int rightHeight = checkHeight(root.right);
		if(rightHeight == Integer.MIN_VALUE) {return Integer.MIN_VALUE;}
		
		int diff = leftHeight - rightHeight;
		if(Math.abs(diff) > 1) {
			return Integer.MIN_VALUE;
		} else {
			return Math.max(rightHeight, leftHeight) + 1;
		}
	}


	public static void main(String args[]) {
		Node root = new Node(4);

		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);

		root.right = new Node(10);
		root.right.left = new Node(8);
		root.right.right = new Node(12);
		
		System.out.println(isBalanced(root));
		
		root.right.right.right = new Node(12);
		
		System.out.println(isBalanced(root));
		
		root.right.right.right.right = new Node(12);
		
		System.out.println(isBalanced(root));
	}
}
