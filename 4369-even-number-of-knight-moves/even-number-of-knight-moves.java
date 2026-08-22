class Solution {
    public boolean canReach(int[] start, int[] target) {

        int d1 = Math.abs(start[0]-target[0]);

        int d2 = Math.abs(start[1]-target[1]);

        return (d1+d2)%2==0;
    }
}