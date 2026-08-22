class Solution {
    public boolean[] transformStr(String s, String[] strs) {

        int n = s.length();

        int zeroS = 0;
        int oneS = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') zeroS++;
            else oneS++;
        }

        boolean[] ans = new boolean[strs.length];

        for (int k = 0; k < strs.length; k++) {

            char[] str = strs[k].toCharArray();

            int zero = 0;
            int one = 0;

            for (char c : str) {
                if (c == '0') zero++;
                else if (c == '1') one++;
            }

            int needZero = zeroS - zero;
            int needOne = oneS - one;

            if (needZero < 0 || needOne < 0) {
                ans[k] = false;
                continue;
            }

            // Change ? to 0 from left to right
            for (int i = 0; i < n && needZero > 0; i++) {
                if (str[i] == '?') {
                    str[i] = '0';
                    needZero--;
                }
            }

            // Change remaining ? to 1
            for (int i = 0; i < n && needOne > 0; i++) {
                if (str[i] == '?') {
                    str[i] = '1';
                    needOne--;
                }
            }

            // Check prefix condition
            int onesS = 0;
            int onesStr = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '1')
                    onesS++;

                if (str[i] == '1')
                    onesStr++;

                if (onesStr > onesS) {
                    possible = false;
                    break;
                }
            }

            ans[k] = possible;
        }

        return ans;
    }
}