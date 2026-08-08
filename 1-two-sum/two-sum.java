class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        int ans [] = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){

            int c = target - nums[i];

            if(map.containsKey(c)){

                return new int[]{map.get(c),i};
            }

            map.put(nums[i],i);
        }

        return new int[]{};
        
    }
}