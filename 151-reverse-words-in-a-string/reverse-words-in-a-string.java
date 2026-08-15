class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        int n = s.length();

        int i = n-1;

        while(i>=0){

            while(i>=0 && s.charAt(i)==' ')

            i--;

            if(i<0) break;

            int j = i;

            while(i>=0 && s.charAt(i)!=' ')

            i--;

            String temp = s.substring(i+1,j+1);

            if(sb.length() != 0)

            sb.append(' ');

            sb.append(temp);
        }

        return sb.toString();
        
    }
}