package leetcode;

import java.util.HashMap;
import java.util.Map;

public class �ཻ���� {

}
class Solution3 {
	   //������ⷨ  ��headB�������жϽڵ���headA�������Ƿ����                                  Ч��̫��      ������ʹ��      �����˰ٷ�֮��
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
    
     //˫ָ�뷨         ����A��ָ��p���������β��ʱ���Զ�����headB��ͷ���������±���  ����B��ָ��qͬ��
     //������ָ������ʱ�������Ľڵ㼴Ϊ�ཻ�ĵ�һ���ڵ�
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
