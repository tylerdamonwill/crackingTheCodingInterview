import java.util.ArrayList;

class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
public class treeTraversal {
	public static void inOrderPrint(Node n) {
		if ( n != null) {
			inOrderPrint(n.left);
			System.out.println(n.key);
			inOrderPrint(n.right);
		}
	}
	
	public static void preOrderPrint(Node n) {
		if ( n != null) {
			System.out.println(n.key);
			preOrderPrint(n.left);
			preOrderPrint(n.right);
		}
	}
	
	public static void postOrderPrint(Node n) {
		if ( n != null) {
			postOrderPrint(n.left);
			postOrderPrint(n.right);
			System.out.println(n.key);
		}
	}
	
	
	public static void main(String[] args) {
		Node test = new Node(10);
		
		test.left = new Node(5);
		
		test.left.left = new Node(9);
		test.left.right = new Node(18);
		
		test.right = new Node(20);
		test.right.left = new Node(3);
		test.right.right = new Node(7);
		
		System.out.println("In-Order Traversal");
		inOrderPrint(test);
		
		System.out.println("Pre-Order Traversal");
		preOrderPrint(test);
		
		System.out.println("Post-Order Traversal");
		postOrderPrint(test);
	}
}

