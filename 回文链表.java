package leetcode;

import java.util.Stack;

/**
 * 判断一个链表是否为回文链表 
 * Stack的pop和peak方法的区别是 pop方法返回栈顶元素并删除   peak只返回值不删除
 * @author hp
 *
 */
public class 回文链表 {

}
class Solution6{
   public boolean isPalindrome(ListNode head) {
	   //用快慢指针找到链表的中点     fast和low
	   if(head==null||head.next==null) return true;
	   ListNode fast=head.next.next;
	   ListNode slow=head.next;
	   while(fast!=null&&fast.next!=null)
	   {
		   slow=slow.next;
		   fast=fast.next.next;
	   }
	   //此时low指针指向中间结点
	   
	   //反转前半部分的链表
	   ListNode prev=null;
	   ListNode curr=head;
	   while(curr!=slow)
	   {
		   ListNode next=curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=next;
	   }
	  //此时的prev结点是反转链表的头节点  
	   
	   //如果是奇数个则让slow结点指向next
	   if(fast!=null)
	   {
		   slow=slow.next;
	   }
	   
	   //回文比较
	   while(prev!=null)
	   {
		   if(prev.val!=slow.val)
		   {
			   return false;
		   }
		   prev=prev.next;
		   slow=slow.next;
	   }
	   return true;
    }
}