package org.greyhope.structures;

/**
 * 
 * @author ebe
 *
 */
public class LinkedNodeList {

	private Node begin;
	private int size;

	/**
	 * <p>
	 * A no arg constructor. no need to set anything on the linked list
	 * </p> 
	 */
	public LinkedNodeList() {
		super();
	}

	/**
	 * <p>
	 * Add to end of linked list. Traverse to the end of the list and then set the next of the tail element to the new node
	 * </p>
	 * <ul>
	 * <li> check if the data sent for insertion is null and return </li>
	 * <li> check if the begin node is null, if so then set the begin node to the new node and return </li>   
	 * <li> create a new node for insertion, create a current node as initially set to the begin </li>
	 * <li> while-traverse the nodes until end with current node as pointer to final node in traversal </li> 
	 * <li> set the next node on the final node to the new node </li>
	 * <li> increment the size counter </li>
	 * </ul>
	 *  
	 * @param data the data to be inserted at the tail 
	 */
	public void addAtTail(Object data) {
		Node newNode = new Node(data);
		if (begin == null) {
			begin = newNode;
		} else {
			Node current = begin;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
		size++;
	}
	
	/**
	 * <p>Add the head of the linked list</p>
	 * <ul>
	 * <li>Check if the value sent is null, if so return</li>
	 * <li>Create a new node with value sent</li>
	 * <li>Set the next node of the new node to the begin node of the linked list</li>
	 * <li>Set the begin node to the new node</li>
	 * <li>Increment the size counter</li>
	 * </ul>
	 * 
	 * @param value Object value to be added at the head of the linked list 
	 */
	public void addAtHead(Object value) {
		if(value == null) {
			return;
		}
		Node newNode = new Node(value);
		newNode.setNext(begin);
		begin = newNode;
		size++;
	}

	/**
	 * <p>List all the elements of the linked list including a size</p>
	 * 
	 */
	public void listAll() {
		Node current = begin;
		System.out.println("Size : " + size);

		while (current != null ) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	/**
	 * <p>
	 * Remove the last node from the linked list
	 * </p>
	 * <ul>
	 * <li>Create a current node referencing the begin node</li>
	 * <li>Create a temp prior node</li>
	 * <li>Check if the current(begin) is null, if so then return</li>
	 * <li>While-Traverse the linked list until end</li>
	 * <ul>
	 * 	<li>Check whether the iterated node is the node to be deleted</li>
	 *  <li>Set the prior node next to the current node next node</li>
	 *  <li>Decrement the size counter</li>
	 * </ul>
	 * <li>If the iterated node isnt the to-be-deleted node</li>
	 * <ul>
	 * 	<li>Set the prior node to the current iterated node</li>
	 *  <li>Set the current to the current.next node</li>
	 * </ul>
	 * </ul>
	 * @param value Remove the node that has this data 
	 */
	public void remove(Object value) {
		Node current = begin;
		Node prior;
		if(current == null) {
			return;
		}
		prior = current;
		while(current.getNext() != null) {
			if(current.getData().equals(value)) {
				prior.setNext(current.getNext());
				size--;
				return;
			}else {
				prior = current;
				current = current.getNext();
			}
		}
	}

	/**
	 * <p>Add a node at the specified index provided</p>
	 * 
	 * <ul>
	 * <li>If the index is 0 then use then @see addAtIndex(Object value)</li>
	 * <li>Create a new node of the value</li>
	 * <li>Create a current node and set to head node</li>
	 * <li>For-Traverse the linked list to index-1</li>
	 * <li>Set the next of the new node to the next of the index-1 node</li>
	 * <li>Set the next node of the index-1 node to the new node</li>
	 * <li>Increment the size counter</li>
	 * </ul>
	 * 
	 * @param index The index at which to add the new element 
	 * @param value The data value of which to add at the above index  
	 */
	public void addAtIndex(int index, Object value) {
		if(index == 0) {
			addAtHead(value);
			return;
		}
		Node newNode = new Node(value);
		Node current = begin;
		for(int c = 0;c < index - 1;c++) {
			current = current.getNext();
		}
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		size++;
		
	}

	/**
	 * <p>Remove the node at the specified index</p>
	 * <ul>
	 * <li>Create a current node and set to the begin</li>
	 * <li>For-Traverse the linked list and set the current node to the index-1</li>
	 * <li>Use the index-1 node and set its next node to the index-1 node.next.next</li>
	 * <li>Decrement the size counter</li>
	 * </ul>
	 * @param index The index integer of which to remove 
	 */
	public void removeAtIndex(int index) {
		Node current = begin;
		for(int c=0;c < index-1;c++) {
			System.out.println(c);
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		size--;
	}
}
