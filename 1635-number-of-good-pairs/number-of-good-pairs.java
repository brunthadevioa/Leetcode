class Solution {
    public int numIdenticalPairs(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int i=0;i<n;i++){

            if(map.containsKey(nums[i]))

                count+=map.get(nums[i]);

                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }

            return count;
        }
        
}