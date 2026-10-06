class Solution {
    public int minAddToMakeValid(String s) {
        
        int n = s.length();

        int f = 0;

        int l = 0;

        for(int i=0;i<n;i++){

            if(s.charAt(i)=='('){

                f++;
            }

            else{

                if(f>0){

                    f--;
                }

                else{

                    l++;
                }
            }
        }

        return f + l;
    }
}