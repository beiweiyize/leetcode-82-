package 算法;

public class 两数之和 {
public static void main(String[] args) {
	//测试链表通过
}
}

class ListNode1 {
	     int val;
	     ListNode1 next;
	     ListNode1(int x) { val = x; }
}

class Solution1 {
    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
		ListNode1 p=l1;
		ListNode1 q=l2;
		ListNode1 head=new ListNode1(0);
		ListNode1 curr=head;
		int count=0;                 //count是进位标志位，初始值为0
		while(p!=null||q!=null)
		{
			int x=p!=null?p.val:0;
			int y=q!=null?q.val:0;
			int sum=x+y+count; 
			count=sum/10;                  //当前的和除以为进位的大小
			curr.next=new ListNode1(sum%10);     
			curr=curr.next;               
			p=p!=null?p.next:p;
			q=q!=null?q.next:q;
		}
		if(count>0)
		{
			curr.next=new ListNode1(1);
		}
		return head;
    }
}

class Solution555{
	 public ListNode1 deleteDuplicates(ListNode1 head) {
		     ListNode1 curr=head;
		     while(curr!=null&&curr.next!=null)
		     {
		    	 if(curr.val==curr.next.val)
		    	 {
		    		 curr.next=curr.next.next;
		    	 }
		     }
		     return head;
	 }
}