package ̰��;

public class ������Ʊ�����ʱ��2 {

}

class Solution20 {
	//����ͼ������������   ��ȷ�  ����һ�α������ۼӹ���
    public int maxProfit(int[] prices) {
         int maxprofit=0;
         int i=0;
         
         int allery=0;
         int peak=0;
         while(i<prices.length-1)
         {
         	while(i<prices.length-1&&prices[i]>=prices[i+1])            
                 i++;            
         	allery=i;
         	while(i<prices.length-1&&prices[i]<=prices[i+1])
         	    i++;
         	peak=i;
         	maxprofit+=prices[peak]-prices[allery];
         }
         return maxprofit;
    }
}