class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0; 
        int sell;
        int buy;
        
        buy = prices[0];
        
       
        for(int i = 1; i < prices.length; i++) 
        {
           
            
            if(prices[i] < buy) {
                buy = prices[i];
            }
            
            else {
                sell = prices[i];
                
                if(sell - buy > profit) {
                    profit = sell - buy;
                }
            }
        }
        
        
        return profit;
    }
}