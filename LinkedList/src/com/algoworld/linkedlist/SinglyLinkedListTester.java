//$Id$
package com.algoworld.linkedlist;

public class SinglyLinkedListTester {

	public static void main(String[] args) {
		ExchangeThread t1 = new ExchangeThread(10);
		ExchangeThread t2 = new ExchangeThread(20);
		ExchangeThread t3 = new ExchangeThread(30);
		
		t1.start();
		t2.start();
		t3.start();
		t1.show();
		t2.show();
		t3.show();
	}
}
