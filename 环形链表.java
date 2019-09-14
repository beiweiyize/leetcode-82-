package leetcode;

import java.util.HashSet;
import java.util.Set;

public class 环形链表 {

}
class Solution2 {
	//方法一  哈希表存放链表的值 遍历判断当前节点是否为空       注意:效率较低 不建议使用
    public boolean hasCycle(ListNode head) {
    	Set<ListNode> set=new HashSet<>();
    	while(head!=null)
    	{
    		if(set.contains(head))
    		{
    			return true;
    		}else {
    			set.add(head);
    		}
    		head=head.next;
    	}
    	return false;
    }
    
    //快慢指针  双指针       时间复杂度为O(n) 空间复杂度为O(1)  效率较高
    public boolean hasCycle1(ListNode head) { 
    	if(head==null||head.next==null)
    	{
    		return false;
    	}
    	ListNode low=head;
    	ListNode fast=head.next;
    	while(low!=fast)
    	{
    		if(fast!=null||fast.next==null)
    		{
    			return false;
    		}
    		low=low.next;
    		fast=fast.next.next;
    	}
    	return true;
    }              
}
