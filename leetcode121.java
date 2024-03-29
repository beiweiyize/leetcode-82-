package 动态规划;

public class leetcode121 {

}
class Solution22 {
	//使用峰谷法  一次遍历
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++)
        {
        	if(prices[i]<minprice)
        	{
        		minprice=prices[i];
        	}
        	else if(prices[i]-minprice>maxprofit)
        	{
        		maxprofit=prices[i]-minprice;
        	}
        }
        return maxprofit;
    }
}
