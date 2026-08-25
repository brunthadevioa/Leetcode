class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){

            set.add(num);
        }    

        int c = k;

        while(set.contains(c)){

            c+=k;
        }

        return c;
        
    }
}