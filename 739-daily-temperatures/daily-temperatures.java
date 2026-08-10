class Solution {
    public int[] dailyTemperatures(int[] temp) {
        

        int n = temp.length;

        Stack<Integer> stk = new Stack<>();

        int [] ans = new int[n];

        for(int i=0;i<n;i++){

            while(!stk.isEmpty() && temp[i]>temp[stk.peek()]){

             int in = stk.pop();

                ans[in] = i - in;
            }

            stk.push(i);
        }

        return ans;

        
    }

    
}