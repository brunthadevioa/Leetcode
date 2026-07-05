class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        for(int i=0;i<n;i++){

            boolean nge = false;

            for(int j=i+1;j<2*n;j++){

                if(nums[j%n]>nums[i]){

                    ans[i] = nums[j%n];

                    nge = true;

                    break;
                }
            }

            if(nge == false){

                ans[i] = -1;
            }
        }

        return ans;
        
    }
}