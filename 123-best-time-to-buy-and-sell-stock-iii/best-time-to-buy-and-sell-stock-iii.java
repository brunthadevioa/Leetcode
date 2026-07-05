class Solution {
    public int maxProfit(int[] prices) {

     

        int p1 = Integer.MIN_VALUE;

        int p2 = Integer.MIN_VALUE;

        int s1 = 0;

        int s2 = 0;

        for(int p : prices){

            p1 = Math.max(p1,-p);

            s1 = Math.max(s1,p1+p);

            p2 = Math.max(p2,s1-p);

            s2 = Math.max(s2,p2+p);
        }

        return s2;

        
    }
}