class Solution {
    public boolean uniformArray(int[] nums1) {

        boolean even = true, odd = true;

        int minOdd = Integer.MAX_VALUE;

        for (int x : nums1) {
            if (x % 2 != 0)
                minOdd = Math.min(minOdd, x);
        }

        for (int x : nums1) {

            // Can x become even?
            if (x % 2 != 0 && minOdd >= x)
                even = false;

            // Can x become odd?
            if (x % 2 == 0 && minOdd >= x)
                odd = false;
        }

        return even || odd;
    }
}