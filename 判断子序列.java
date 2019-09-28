package 贪心;

public class 判断子序列 {

}

class Solution21 {
	//判断s是否为t的子序列
    public boolean isSubsequence(String s, String t) {
    	if(s.length()==0) return true;
        int i=0;
        int j=0;
        char[] s1=s.toCharArray();
        while(i<t.length())
        {
        	if(t.charAt(i)==s1[j])
        	{
        		i++;
        		j++;
        		if(j==s1.length)  return true;
        	}else {
        		i++;
        	}
        }
        return false;
    }
    
    //判断子序列问题的后续要求   DP动态规划          优化子结构和重叠子问题          找出状态转移公式
    public boolean isSubsequence1(String s, String t) {
    	 int sLen = s.length(), tLen = t.length();
         if (sLen > tLen) return false;
         if (sLen == 0) return true;
         boolean[][] dp = new boolean[sLen + 1][tLen + 1];
         //初始化
         for (int j = 0; j < tLen; j++) {
             dp[0][j] = true;
         }
         //dp
         for (int i = 1; i <= sLen; i++) {
             for (int j = 1; j <= tLen; j++) {
                 if (s.charAt(i - 1) == t.charAt(j - 1)) {
                     dp[i][j] = dp[i - 1][j - 1];
                 } else {
                     dp[i][j] = dp[i][j - 1];
                 }
             }
         }
         return dp[sLen][tLen];
    }
}