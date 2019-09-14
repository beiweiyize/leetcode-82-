package leetcode;

import java.util.Stack;

/**
 * �ж�һ�������Ƿ�Ϊ�������� 
 * Stack��pop��peak������������ pop��������ջ��Ԫ�ز�ɾ��   peakֻ����ֵ��ɾ��
 * @author hp
 *
 */
public class �������� {

}
class Solution6{
   public boolean isPalindrome(ListNode head) {
	   //�ÿ���ָ���ҵ�������е�     fast��low
	   if(head==null||head.next==null) return true;
	   ListNode fast=head.next.next;
	   ListNode slow=head.next;
	   while(fast!=null&&fast.next!=null)
	   {
		   slow=slow.next;
		   fast=fast.next.next;
	   }
	   //��ʱlowָ��ָ���м���
	   
	   //��תǰ�벿�ֵ�����
	   ListNode prev=null;
	   ListNode curr=head;
	   while(curr!=slow)
	   {
		   ListNode next=curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=next;
	   }
	  //��ʱ��prev����Ƿ�ת�����ͷ�ڵ�  
	   
	   //���������������slow���ָ��next
	   if(fast!=null)
	   {
		   slow=slow.next;
	   }
	   
	   //���ıȽ�
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