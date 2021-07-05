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

public class partition {
	
	static Node partition(Node n, int x) {// Look more on growing at both sides, step through a 5 element list
		Node head = n, tail = n;
		
		while(n != null) {
			Node next = n.next;
			if(n.data < x) {
				n.next = head;
				head = n;
			} else {
				tail.next = n;
				tail = n;
			}
			n = next;
		}
		tail.next = null;
		
		return head;
	}

	public static void main(String[] args) {
		Node n = new Node(3);
		n.appendToTail(5);
		n.appendToTail(8);
		n.appendToTail(5);
		n.appendToTail(10);
		n.appendToTail(2);
		n.appendToTail(1);
		n.print();
		n = partition(n, 5);
		n.print();
	}
}

