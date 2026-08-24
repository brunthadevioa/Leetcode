class Solution {
    public int maxArea(int[] h) {

        int i = 0,j=h.length-1,max = 0;

        while(i<j){

            int c= Math.min(h[i],h[j]) * (j-i);

            max = Math.max(max,c);

            if(h[i]<h[j]) i++;

            else j--;
        }

        return max;
        
    }
}