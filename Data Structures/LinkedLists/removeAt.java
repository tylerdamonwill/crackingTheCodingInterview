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

public class removeAt {
	
	static void removeAt(Node c) {
		Node prev = null;
		while(c.next != null) {
			c.data = c.next.data;
			prev = c;
			c = c.next;
		}
		prev.next = null;
	}

	public static void main(String[] args) {
		Node n = new Node(1);
		n.appendToTail(5);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		Node test1 = n.appendToTail(3);
		n.appendToTail(3);
		n.appendToTail(3);
		n.appendToTail(10);
		Node test2 = n.appendToTail(4);
		n.appendToTail(2);
		n.appendToTail(5);
		n.print();
		removeAt(test1);
		n.print();
		removeAt(test2);
		n.print();
	}
}

