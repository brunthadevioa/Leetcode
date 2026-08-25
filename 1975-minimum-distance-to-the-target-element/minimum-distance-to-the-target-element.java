class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int n = nums.length;

        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){

            if(nums[i]==target){

                int d = Math.abs(i-start);

                min = Math.min(min,d);
            }
        }

        if(min==Integer.MIN_VALUE){

            return 0;
        }

        return min;

        
        
    }
}