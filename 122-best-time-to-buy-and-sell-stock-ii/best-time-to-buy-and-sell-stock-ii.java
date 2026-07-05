class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        int p = 0;

        for(int i=0;i<n-1;i++){

            if(prices[i]<prices[i+1]){

                p+=prices[i+1] - prices[i];
            }
        }

        return p;
    }
}