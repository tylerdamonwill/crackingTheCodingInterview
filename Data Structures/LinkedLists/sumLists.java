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

public class sumLists {
	
	static Node sumLists(Node n1, Node n2) {
		Node sum = new Node(0);
		int carry = 0;
		
		while(n1 != null && n2 != null) {
			int temp = carry + n1.data + n2.data;
			if(temp > 9) {
				carry  = 1;
				} else {
					carry = 0;
				}
			sum.appendToTail(temp % 10);
			n1 = n1.next;
			n2 = n2.next;
		}
		
		while(n1 != null) {
			int temp = carry + n1.data;
			if(temp > 9) {
				carry  = 1;
				} else {
					carry = 0;
				}
			sum.appendToTail(temp % 10);
			n1 = n1.next;
		}
		
		while(n2 != null) {
			int temp = carry + n2.data;
			if(temp > 9) {
				carry  = 1;
				} else {
					carry = 0;
				}
			sum.appendToTail(temp % 10);
			n2 = n2.next;
		}
		
		if(carry == 1) {sum.appendToTail(1);}
		
		return sum.next;
	}

	public static void main(String[] args) {
		Node a = new Node(7);
		a.appendToTail(1);
		a.appendToTail(6);
		
		Node b = new Node(5);
		b.appendToTail(9);
		b.appendToTail(2);

		Node sum1 = sumLists(a, b);
		sum1.print(); //219
		
		Node c = new Node(7);
		c.appendToTail(9);
		c.appendToTail(9);
		
		Node d = new Node(9);


		Node sum2 = sumLists(c, d);
		sum2.print(); //6001
	}
}

