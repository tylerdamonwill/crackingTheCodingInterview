import java.util.EmptyStackException;

class Stack<T> {
	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;

		public StackNode(T data) {
			this.data = data;
		}
	}

	private StackNode<T> top;

	public T pop() {
		if (top == null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}

	public void push(T item) {
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
	}

	public T peek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

}

class NodeWithMin{
	public int data;
	public int min;

	public NodeWithMin(int info, int newMin) {
		this.data = info;
		this.min = newMin;
	}
}

public class StackWithMin extends Stack<NodeWithMin>{
	public void push(int item) {
		int newMin = Math.min(item, min());
		super.push(new NodeWithMin(item, newMin));
	}
	
	public int min() {
		if(this.isEmpty()) {throw new EmptyStackException();} 
		return peek().min;
	}
}




