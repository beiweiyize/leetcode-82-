package 贪心;

public class 买卖股票的最佳时机2 {

}

class Solution20 {
	//用来图像来分析问题   峰谷法  或者一次遍历的累加规律
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