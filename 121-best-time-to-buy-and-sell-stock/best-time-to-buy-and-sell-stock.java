class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int p = 0;

        int max = prices[0];

        for(int i=0;i<n;i++){

            if(prices[i]<max){

                max = prices[i];
            }

            else if(p<prices[i] - max){

                p = prices[i] - max;
            }
        }

        return p;
        
    }
}