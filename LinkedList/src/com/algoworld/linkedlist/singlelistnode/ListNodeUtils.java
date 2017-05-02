//$Id$
package com.algoworld.linkedlist.singlelistnode;

public class ListNodeUtils {

	/**
	 * 
	 * @param node
	 * @return
	 * 
	 * spaceComplexity = O(1) for creating length variable
	 * TimeComplexity = O(n) for traversing the complete list
	 */
	public static int getLength(ListNode node){
		if(node !=null){
			int length = 0 ;
			ListNode currentNode = node;
			while(currentNode !=null){
				length++;
				currentNode = currentNode.getNext();
			}
			return length;
		}else {
			return 0;
		}
	}
	
	public static String printSLL(ListNode node){
		if(node!=null){
			StringBuilder sb = new StringBuilder();
			ListNode currentNode =  node;
			while(currentNode  != null){
				sb.append(currentNode.getData()+" --> ");
				currentNode = currentNode.getNext();
			}
			return sb.toString();
		}else{
			return "empty";
		}
	}
	
	
}
