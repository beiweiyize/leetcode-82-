package leetcode;

/**
 * ����һ����������ɾ�����к����ظ����ֵĽڵ㣬ֻ����ԭʼ������ û���ظ����� �����֡�
 * @author hp
 *
 */
public class ɾ�������ظ��ڵ� {

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