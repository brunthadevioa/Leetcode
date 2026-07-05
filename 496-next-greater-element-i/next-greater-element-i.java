class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;

        int m = nums2.length;

        int[] ans = new int[n];

        for(int i=0;i<n;i++){

            boolean found = false;

            boolean nge = false;

            for(int j=0;j<m;j++){

                if(nums1[i]==nums2[j]){

                    found = true;
                }

                if(nums2[j]>nums1[i] && found == true){

                    ans[i] = nums2[j];

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