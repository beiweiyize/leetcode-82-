package leetcode;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * @author hp
 *
 */
public class 删除链表重复节点 {

}


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode dump=new ListNode(0);
    	dump.next=head;
    	ListNode p=dump;
    	int flag=0;
    	while(p.next.next!=null)
    	{
    		if(p.next.val==p.next.next.val)
    		{
    			flag=1;
    			p.next=p.next.next;
    		}else {
    			if(flag==0)
    			{
    				p=p.next;
    			}else {
    				p.next=p.next.next;
    				flag=0;
    			}
    		}
    	}
    	if(flag==1)
    	{
    		p.next=p.next.next;
    	}
    	return dump.next;
    }
}