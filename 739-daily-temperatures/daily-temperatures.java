class Solution {
    public int[] dailyTemperatures(int[] temp) {

        int n = temp.length;

        Stack<Integer> stk = new Stack<>();

        int res[] = new int[n];

        for(int i=0;i<n;i++){

            while(!stk.isEmpty() && temp[i]>temp[stk.peek()]){

                int in = stk.pop();

                res[in] = i-in;
            }

            stk.push(i);
        }

        return res;

    }
}