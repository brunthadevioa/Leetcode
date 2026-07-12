class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][]ok=new boolean[n][n];
        int[][]c=grid;
        for(int i=0;i<n;i++){
            ok[i][i]=true;
            for(int j=i+1;j<n;j++){
                boolean valid=true;
                for(int r=0;r<m;r++){
                    if(Math.abs(c[r][j]-c[r][i])>limit){
                        valid=false;
                        break;
                    }
                }
                ok[i][j]=valid;
            }
        }
        int[]ans=new int[n];
        int res=1;
         for (int j = 0; j < n; j++) {
            ans[j] = 1;
            for (int i = 0; i < j; i++) {
                if (ok[i][j]) {
                    ans[j] = Math.max(ans[j], ans[i] + 1);
                }
            }
            res = Math.max(res, ans[j]);
        }
        return res;
    }
}