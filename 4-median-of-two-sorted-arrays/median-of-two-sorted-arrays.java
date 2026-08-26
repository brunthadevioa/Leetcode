class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a = nums1.length;

        int b = nums2.length;

        int[] arr = new int[a+b];

        int i=0,j=0,k=0;

        while(i<a && j<b){

            if(nums1[i]<nums2[j]){

                arr[k++] = nums1[i++];
            }

            else{

                arr[k++] = nums2[j++];
            }
        }

        while(i<a){

            arr[k++] = nums1[i++];
        }

        while(j<b){

            arr[k++] = nums2[j++];
        }

        int n = arr.length;

        if(n%2==1){

            return arr[n/2];
        }

        return (arr[n/2-1] + arr[n/2])/2.0;
        
    }
}