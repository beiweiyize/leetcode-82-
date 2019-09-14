package leetcode;

import java.util.HashSet;
import java.util.Set;

public class �������� {

}
class Solution2 {
	//����һ  ��ϣ���������ֵ �����жϵ�ǰ�ڵ��Ƿ�Ϊ��       ע��:Ч�ʽϵ� ������ʹ��
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
    
    //����ָ��  ˫ָ��       ʱ�临�Ӷ�ΪO(n) �ռ临�Ӷ�ΪO(1)  Ч�ʽϸ�
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
