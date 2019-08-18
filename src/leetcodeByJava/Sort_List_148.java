/**
 * tzzhang
 * 下午10:53:22
 */
package leetcodeByJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Sort_List_148 {

	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
    		return head;
    	}
    	ListNode mid = getMid(head);
    	ListNode another;
    	if (mid == null) {
    		another = null;
    	} else {
    		another = mid.next;
    		mid.next = null;
    	}
    	return mergeSortedList(sortList(head), sortList(another));
        
    }
	
	 private ListNode getMid(ListNode head) {
	    	if (head == null || head.next == null) {
	    		return head;
	    	}
	    	ListNode fast = head;
	    	ListNode slow = head;
	    	while (fast.next != null && fast.next.next != null) {
	    		fast = fast.next.next;
	    		slow = slow.next;
	    	}
	    	return slow;
	 }
	

	/**
	 * @param leftList
	 * @param rightList
	 * @return
	 */
	 private ListNode mergeSortedList(ListNode first, ListNode second) {
	    	if (first == null && second == null) {
	    		return null;
	    	}
	    	if (first == null) {
	    		return second;
	    	}
	    	if (second == null) {
	    		return first;
	    	}
	    	
	    	// 虚拟一个head的前缀节点，避免前缀额外的操作确定头节点
	    	ListNode pre = new ListNode(0);
	    	ListNode curNode = pre;
	    	
	    	ListNode cur1 = first;
	    	ListNode cur2 = second;
	    	while (cur1 != null && cur2 != null) {
	    		if (cur1.val <= cur2.val) {
	    			curNode.next = cur1;
	    			cur1 = cur1.next;
	    		} else {
	    			curNode.next = cur2;
	    			cur2 = cur2.next;
	    		}
	    		curNode = curNode.next;
	    	}
	    	
	    	// 处理剩余的元素
	    	if (cur1 != null) {
	    		curNode.next = cur1;
	    	}
	    	if (cur2 != null) {
	    		curNode.next = cur2;
	    	}
	    	
	    	return pre.next;
	 }

	
	
	
}
