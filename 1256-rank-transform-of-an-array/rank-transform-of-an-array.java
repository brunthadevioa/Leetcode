class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;

        int[] sorted = new int[n];

        for(int i=0;i<n;i++){

            sorted[i] = arr[i];
        }

        Arrays.sort(sorted);

        int rank = 1;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:sorted){

            if(!map.containsKey(num)){

                map.put(num,rank++);
            }
        }

        for(int i=0;i<n;i++){

            arr[i] = map.get(arr[i]);
        }

        return arr;
        
    }
}