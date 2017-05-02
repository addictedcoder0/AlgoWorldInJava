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
	 *  I am not using synchronized b/c of its drawback of locking complete method + possibility of deadlocks 
	 */
	
	public void insertAtBegin(ListNode node){
		l.lock();  // thread acquires the lock 
		node.setNext(getHead());
		head = node;
		length++;
		l.unlock(); // thread releases the lock
	}
	
	public void insertAtEnd(ListNode node){
		l.lock();
		ListNode lastNode =  ListNodeUtils.getLastNode(getHead());
		if(lastNode == null){
			head = node;
		}else{
			lastNode.setNext(node);
		}
		l.unlock();
	}
	
	@Override
	public String toString() {
		return ListNodeUtils.printSLL(head);
	}
	
	
}
