import java.io.*;
import java.util.*;

class createBalancedBST {
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	public Node createBalancedBST(int[] arr) {
		return createBalancedBSTHelp(arr, 0, arr.length-1);
	}

	public Node createBalancedBSTHelp(int[] arr, int start, int end){
		if(end > start) {
			return null;
		}

		int mid = (end - start) / 2;
		Node tree = new Node(arr[mid]);
		tree.left = createBalancedBSTHelp(arr, start, mid - 1);
		tree.right = createBalancedBSTHelp(arr, mid + 1, end);
		return tree;
	}

	public static void main(String args[]) {

	}
}
