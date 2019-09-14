package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ��������2 {
public static void main(String[] args) {
	
}
}

/**
 * 1.�ڻ�������1�Ļ�����Ҫ�󷵻��뻷�ĵ�һ�����   
 * 2.���Ҳ�ʹ�ö���ռ�(����ռ䷨   ����������һ�еĹ�ϣ����)
 * @author hp
 *
 */
class Solution7{
	//ʹ�ö���ռ�          HashSet��ϣ��ķ���
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
	  
	 //��ʹ�ö���ռ�     ����ָ�뷨         ��ѧԭ��        Floyd�㷨
	 public ListNode detectCycle2(ListNode head) {
		 if(head==null||head.next==null)    return null;
	      ListNode fast=head.next.next;
	      ListNode slow=head.next;
	      ListNode part2=null;
	      ListNode part1=head;
		  
	      //�ҵ�������
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
