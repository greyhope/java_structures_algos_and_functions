package org.greyhope.structures;

import org.junit.*;

public class LinkedNodeListTester {
	
	@Test
	public void testInsertOnlyOne() {
		System.out.println("-- Test only one element --");
		LinkedNodeList list = new LinkedNodeList();
		list.addAtTail("one");
		list.listAll();
	}

	@Test
	public void testEmpty() {
		System.out.println("-- Test Empty --");
		LinkedNodeList list = new LinkedNodeList();
		list.listAll();
	}

	@Test
	public void testInsertionOnlyNine() {
		System.out.println("-- Test insertion of nine --");
		LinkedNodeList list = new LinkedNodeList();
		list.addAtTail("one");
		list.addAtTail("two");
		list.addAtTail("three");
		list.addAtTail("four");
		list.addAtTail("five");
		list.addAtTail("six");
		list.addAtTail("seven");
		list.addAtTail("eight");
		list.addAtTail("nine");
		list.listAll();
	}
	
	@Test
	public void testRemoveSpecificElement() {
		System.out.println("-- Test removal of blah --");
		LinkedNodeList list = new LinkedNodeList();
		list.addAtTail("one");
		list.addAtTail("two");
		list.addAtTail("three");
		list.addAtTail("four");
		list.addAtTail("blah");
		list.addAtTail("five");
		list.addAtTail("six");
		list.addAtTail("seven");
		list.addAtTail("eight");
		list.addAtTail("nine");
		list.listAll();
		list.remove("blah");
		list.listAll();
	}
	
	@Test
	public void testInsertAtHead() {
		System.out.println("-- Test insert at head --");
		LinkedNodeList list = new LinkedNodeList();
		list.addAtTail("one");
		list.addAtTail("two");
		list.addAtTail("three");
		list.listAll();
		
		list.addAtHead("zero");
		list.listAll();
	}
	
	@Test
	public void testAddAtIndex() {
		System.out.println("-- Test insert at Index --");
		LinkedNodeList list = new LinkedNodeList();
		list.addAtTail("one");
		list.addAtTail("two");
		list.addAtTail("four");
		list.listAll();
		
		list.addAtIndex(2,"three");
		list.listAll();		
	}
	
	@Test 
	public void testRemoveAtIndex() {
		System.out.println("-- Test Delete at Index --");
		LinkedNodeList list = new LinkedNodeList();
		list.addAtTail("1-one");
		list.addAtTail("2-two");
		list.addAtTail("3-three");
		list.addAtTail("4-three");
		list.listAll();
		
		list.removeAtIndex(2);
		list.listAll();		
		
	}

}
