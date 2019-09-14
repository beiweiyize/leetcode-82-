package leetcode;

import java.util.HashMap;
import java.util.Map;

public class 相交链表 {

}
class Solution3 {
	   //暴力求解法  从headB中依次判断节点在headA链表中是否存在                                  效率太低      不建议使用      击败了百分之五
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode curr=headA;
         while(headB!=null)
         {
        	 while(curr!=null)
        	 {
        		 if(headB==curr)
        		 {
        			 return curr;
        		 }else {
        			 curr=curr.next;
        		 }
        	 }
        	 headB=headB.next;
        	 curr=headA;
         }
         return null;
    }
    
     //双指针法         链表A的指针p到达链表的尾部时，自动接在headB的头部继续向下遍历  链表B的指针q同理
     //当两个指针相遇时，相遇的节点即为相交的第一个节点
    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB)
    {
    	 if(headA == null || headB == null) return null;
         ListNode pA = headA, pB = headB;
         while(pA != pB) {
             pA = pA == null ? headB : pA.next;
             pB = pB == null ? headA : pB.next;
         }
         return pA; 	 
    }
}
