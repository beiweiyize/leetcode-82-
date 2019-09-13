package leetcode;

import java.util.Date;

public class ����ĵ�����k���ڵ� {
public static void main(String[] args) {
	ListNode a1=new ListNode(1);
	ListNode a2=new ListNode(2);
	ListNode a3=new ListNode(3);
	ListNode a4=new ListNode(4);
	ListNode a5=new ListNode(5);
	a1.next=a2;
	a2.next=a3;
	a3.next=a4;
	a4.next=a5;
	long begin=System.currentTimeMillis();
	ListNode result=Solution4.getListNodeK(a1, 4);
	long end=System.currentTimeMillis();
	System.out.println(result.val);
	System.out.println("1:"+(end-begin));
	
	long begin1=System.currentTimeMillis();
	ListNode result1=Solution4.getListNodeK1(a1, 4);
	long end1=System.currentTimeMillis();
	System.out.println(result1.val);
	System.out.println("2:"+(end1-begin1));
}
}
class Solution4{
private static  int num=0;
	//����һ  ���淽�� ���α���
	public static ListNode  getListNodeK(ListNode l1,int k)
	{
		if(l1==null)
		{
			return null;
		}
		ListNode p=l1;
		int size=0;
		int count=0;
		//��һ�α���   ��ȡ����ڵ�ĸ���
		while(p!=null)
		{
			size++;
			p=p.next;
		}
		if(k>size)
		{
			return null;
		}
		p=l1;
		while(count<size-k)
		{
			p=p.next;
			count++;
		}
		return p;
	}
	
	//������ ������  ˫ָ�뷽��   ��һ��ָ����k�� �ڶ���ָ�뿪ʼ��  ͬʱ�� ����һ��ָ�뵽��ĩβʱ �ڶ���ָ��պ�ָ������k���ڵ�
	public static ListNode  getListNodeK1(ListNode l1,int k)
	{
		if(l1==null)
		{
			return null;
		}
		ListNode p=l1;
		ListNode q=l1;
		int count=1;
		while(count<k&&p.next!=null)
		{
			count++;
			p=p.next;
		}
		
		while(p.next!=null)
		{
			q=q.next;
			p=p.next;
		}
		return q;
	}
			
}
	

