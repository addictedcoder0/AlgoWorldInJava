//$Id$
package com.algoworld.linkedlist;

import java.util.concurrent.locks.ReentrantLock;

import com.algoworld.linkedlist.singlelistnode.ListNode;
import com.algoworld.linkedlist.singlelistnode.ListNodeUtils;

public class SinglyLinkedList {

	private static ReentrantLock l = new ReentrantLock();
	private int length;
	private ListNode head;
	
	public ListNode getHead() {
		return head;
	}
	
	public int getLength() {
		//length =  ListNodeUtils.getLength(getHead());
		return length;
	}
	
	/*
	 * support for multithreaded environment by using Reentrant Lock.
	 *  
	 */
	
	public void insertAtBegin(ListNode node){
		l.lock();  // thread acquires the lock 
		node.setNext(getHead());
		head = node;
		length++;
		l.unlock(); // thread releases the lock
	}
	
	@Override
	public String toString() {
		return ListNodeUtils.printSLL(head);
	}
	
}
