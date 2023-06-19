package org.greyhope.structures;

public class Node {

	private Node before;
	private Node next;
	private Object data;

	public Node(Object value) {
		super();
		this.data = value;
	}

	public Node getBefore() {
		return before;
	}

	public void setBefore(Node before) {
		this.before = before;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
