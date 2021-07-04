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

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
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

public class kToLast {
	
	static int kToLast(Node n, int k) {
		if(k < 0) { return -1;}
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(n != null) {
			list.add(n.data);
			n = n.next;
		}
		
		int size = list.size();
		if(size == 0 || size < k) {return -1;}

		return list.get(size - k);
	}

	public static void main(String[] args) {
		Node n = new Node(1);
		n.appendToTail(5);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(3);
		n.appendToTail(3);
		n.appendToTail(3);
		n.appendToTail(10);
		n.appendToTail(4);
		n.appendToTail(2);
		n.appendToTail(5);
		n.print();
		System.out.println("Test 1: " + kToLast(n, 1)); // 5
		System.out.println("Test 1: " + kToLast(n, 12)); // 1
		System.out.println("Test 1: " + kToLast(n, 13)); // -1
		System.out.println("Test 1: " + kToLast(n, -1)); // -1
	}
}

