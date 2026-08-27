class Solution {
    public int maxArea(int[] h) {

        int left = 0, right = h.length-1;

        int max = 0;

        while(left<right){

            int min = Math.min(h[left],h[right]) * (right - left);

            max = Math.max(max,min);

            if(h[left]<h[right]) left++;

            else right--;
        }

        return max;


        
    }
}