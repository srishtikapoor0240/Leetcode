class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int i,j;
        for(i=0;i<prices.length;i++)
        {
                for( j=i+1;j<prices.length;j++)
                {
                    if(prices[j]>prices[i])
                    {
                        int profit=prices[j]-prices[i];
                        maxprofit=Math.max(maxprofit,profit);
                    }
                    else{
                        i=j;
                    }
                }
        }
        return maxprofit;
    }
}