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
		System.out.println(list.substring(0, list.length()-2));
	}
}

public class removedDups {

	static void removedDups(Node n) {
		HashSet<Integer> elements = new HashSet<Integer>();
		Node prev = n;

		while(n != null) {
			int tempSize = elements.size();
			elements.add(n.data);
			if(elements.size() == tempSize) {
				prev.next = n.next;
			} else {
				prev = n;
			}
			n = n.next;
		}
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
		removedDups(n);
		n.print();
	}
}

