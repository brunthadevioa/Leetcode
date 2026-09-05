class Solution {
    public boolean checkDivisibility(int n) {

        int res = n;

        int sum = 0;

        int pro = 1;

        while(n>0){

            int d = n%10;

            sum += d;

            pro *= d;

            n /= 10;
        }

        int div = sum + pro;

        return res % div == 0;

        
        
    }
}