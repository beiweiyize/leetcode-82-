package leetcode;

import java.util.HashSet;
import java.util.Set;

public class 环形链表2 {
public static void main(String[] args) {
	
}
}

/**
 * 1.在环形链表1的基础上要求返回入环的第一个结点   
 * 2.并且不使用额外空间(额外空间法   即环形链表一中的哈希表方法)
 * @author hp
 *
 */
class Solution7{
	//使用额外空间          HashSet哈希表的方法
	 public ListNode detectCycle1(ListNode head) {
	       Set<ListNode> set=new HashSet<>();
	       while(head!=null)
	       {
	    	   if(set.contains(head))
	    	   {
	    		   return head;
	    	   }else {
	    		   set.add(head);
	    	   }	    	   
	       }
	       return null;
	}
	  
	 //不使用额外空间     快慢指针法         数学原理        Floyd算法
	 public ListNode detectCycle2(ListNode head) {
		 if(head==null||head.next==null)    return null;
	      ListNode fast=head.next.next;
	      ListNode slow=head.next;
	      ListNode part2=null;
	      ListNode part1=head;
		  
	      //找到相遇点
	      while(fast!=slow)
	      {
	    	  if(fast==null||fast.next==null)   return null;
	    	  else {
	    		  fast=fast.next.next;
	    		  slow=slow.next;
	    	  }
	      }
	      part2=fast;      		  
		  while(part1!=null)
		  {
			  if(part1==part2)  return part1;
			  part1=part1.next;
			  part2=part2.next;
		  }
		  return  null;
	}
}
