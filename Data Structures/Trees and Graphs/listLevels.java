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

class listLevels {
	
	public static void inOrderPrint(Node root) {
		if(root == null) {return;}
		inOrderPrint(root.left);
		System.out.println(root.key);
		inOrderPrint(root.right);
	}

	public static LinkedList<LinkedList<Node>> listLevels(Node root) {
		LinkedList<LinkedList<Node>> lst = new LinkedList<LinkedList<Node>>();
		listLevelsHelp(root, lst, 0);
		return lst;
	}

	public static void listLevelsHelp(Node root, LinkedList<LinkedList<Node>> lst, int level){
		if(root == null) return;
		
		LinkedList<Node> list = new LinkedList<Node>();
		if(lst.size() == level) {
			lst.add(list);
		} else {
			list = lst.get(level);
		}
		
		list.add(root);
		listLevelsHelp(root.left, lst, level + 1);
		listLevelsHelp(root.right, lst, level + 1);;
	}

	public static void main(String args[]) {
		Node root = new Node(4);
		
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		
		root.right = new Node(10);
		root.right.left = new Node(8);
		root.right.right = new Node(12);
		
		LinkedList<LinkedList<Node>> lst = listLevels(root);
	}
}
