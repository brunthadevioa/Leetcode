class Solution {
    public boolean uniformArray(int[] nums1) {

        int n = nums1.length;

        int[] nums2 = new int[n];

        for(int i=0;i<n;i++){

            for(int j=0;j<nums2.length;j++){

                if(nums2[i]==nums1[j] && nums2[i] != nums1[i]){

                    return true;
                }

                else{

                    if(nums2[i] == nums1[i]-nums1[j]){

                        return true;
                    }
                }
            }
        }

        return true;


        
    }
}