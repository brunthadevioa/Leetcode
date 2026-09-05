class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        int n = nums.length;

        int p[] = new int[n];

        int s[] = new int[n];

        for(int i=0;i<n;i++){

            max = Math.max(max,nums[i]);

            p[i] = max;
        }

        for(int i=n-1;i>=0;i--){

            min= Math.min(min,nums[i]);

            s[i] = min;
        }

        for(int i=0;i<n;i++){

            if(p[i] - s[i]<=k)

                return i;
        }

        return -1;
        
    }
}