// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice= Integer.MAX_VALUE, maxProfit=0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice)
                minPrice=prices[i];
            
            else if(maxProfit<prices[i]-minPrice)
                maxProfit=prices[i]-minPrice;
        }
        
        return maxProfit;
        
    }
}

