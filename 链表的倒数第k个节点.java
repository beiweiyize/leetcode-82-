package leetcode;

import java.util.Date;

public class 链表的倒数第k个节点 {
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
	//方法一  常规方法 两次遍历
	public static ListNode  getListNodeK(ListNode l1,int k)
	{
		if(l1==null)
		{
			return null;
		}
		ListNode p=l1;
		int size=0;
		int count=0;
		//第一次遍历   获取链表节点的个数
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
	
	//方法二 进化版  双指针方法   第一个指针走k步 第二个指针开始走  同时走 当第一个指针到达末尾时 第二个指针刚好指向倒数第k个节点
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
	

