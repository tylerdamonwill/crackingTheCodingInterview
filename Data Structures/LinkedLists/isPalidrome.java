import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Node {
	int data;
	Node next;

	public Node(int d) {
		this.data = d;
	}

	Node appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		return n.next = end;
	}

	void print() {
		String list = "";
		Node n = this;
		while(n != null) {
			list += n.data + "->";
			n = n.next;
		}
		
		if(list == ""){
			System.out.println("Empty List");
		} else {
			System.out.println(list.substring(0, list.length()-2));
		}
	}
}

public class isPalindrome {
	static boolean isPalindrome(Node n) {
		if(n == null) {return true;}
		Node reverse = reversed(n);
		return isSame(reverse, n);
	}

	static Node reversed(Node n) {
		Node reversed = null;
		Node head = new Node(0);
		
		while(n != null) {
			head.appendToTail(n.data);
			Node next = n.next;
			n.next = reversed;
			reversed = n;
			n = next;
		}
		n = head.next;
		return reversed;
	}
	
	static private boolean isSame(Node reverse, Node n) {
		while(n != null) {
			if(reverse.data != n.data) { return false;}
			reverse = reverse.next;
			n = n.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Node a = new Node(7);
		a.appendToTail(1);
		a.appendToTail(7);
		System.out.println(isPalindrome(a)); //true
		
		Node b = new Node(5);
		b.appendToTail(0);
		b.appendToTail(0);
		b.appendToTail(5);
		System.out.println(isPalindrome(b)); //true

		
		Node c = new Node(7);
		System.out.println(isPalindrome(c)); //true
		
		Node d = null;
		System.out.println(isPalindrome(d)); //true
		
		Node e = new Node(7);
		e.appendToTail(1);
		e.appendToTail(1);
		System.out.println(isPalindrome(e)); //false

	}
}

