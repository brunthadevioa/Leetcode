class Solution {
    public long interchangeableRectangles(int[][] rectangles) {

        long count = 0;

        HashMap<Double,Integer> map = new HashMap<>();

        int n = rectangles.length;

        for(int i=0;i<n;i++){

            double ratio = rectangles[i][0]/ (double) rectangles[i][1];

            if(map.containsKey(ratio))

            count+=map.get(ratio);

            map.put(ratio,map.getOrDefault(ratio,0)+1);
        }

        return count;
        
    }
}