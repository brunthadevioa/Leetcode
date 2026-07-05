class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int p = 0;

        int min = prices[0];

        for(int i=0;i<n;i++){

            if(prices[i]<min){

                min = prices[i];
            }

            else if(p<prices[i]-min){

                p = prices[i]-min;
            }
        }
      return p;  
    }
}