//$Id$
package com.algoworld.linkedlist.singlelistnode;

public class ListNode {

	private int data; // jvm will init to 0 by default
	private ListNode next; // jvm will init to null by default
	
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public ListNode getNext() {
		return next;
	}
}
