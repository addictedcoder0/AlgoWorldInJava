//$Id$
package com.algoworld.linkedlist;

import com.algoworld.linkedlist.singlelistnode.ListNode;
/** 
 *	exchangethread is a DummyThread class => responsible for populating the SinglyLinkedList .
 */
public class ExchangeThread extends Thread{
	
	private ListNode ln;
	private static SinglyLinkedList sl = new SinglyLinkedList();
	public ExchangeThread(int data) {
		ListNode ln = new ListNode();
		ln.setData(data);
		this.ln = ln;
	}
	
	public void run(){
		// remove comment for testing insertion at beginning
		//sl.insertAtBegin(ln);
		
		//remove comment for testing insertion at the end
		sl.insertAtEnd(ln);
		try {
			Thread.sleep(200);
		}catch(InterruptedException ie){}
	}
	
	public void show(){
		//print the SinglyLinkedList
		System.out.println(sl);
	}

}
