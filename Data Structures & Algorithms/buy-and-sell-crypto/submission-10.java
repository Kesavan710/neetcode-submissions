class Solution {
    public int maxProfit(int[] prices) 
    {
        int sell,buy,profit;
        sell=0;
        profit=0;
        buy=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(buy>=prices[i])
            {
                buy=prices[i];
            }

    
            if(prices[i]-buy>profit)
                profit=prices[i]-buy;
            
            
        }
        return profit;
        
    }
}