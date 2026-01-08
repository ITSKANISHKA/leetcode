class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length; 
        int m=grid[0].length; 
        int[][] dp=new int[n][m]; 
        for(int [] num: dp){
             Arrays.fill(num,-1000000); 
        } 
         int ans = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            ans = Math.min(ans, Min_Falling(grid, 0, j, dp));
        }
        return ans;
    }
    public static int Min_Falling(int[][] mat,int i,int j,int[][] dp){
        if(j<0 || j>=mat[0].length )return Integer.MAX_VALUE;
        if(i==mat.length-1){
            return mat[i][j];
        }
        if(dp[i][j]!=-1000000){
            return dp[i][j];
        }
        int down=Min_Falling(mat,i+1,j,dp);
        //int right=Min_Falling(mat,i,j+1,dp);
        int ld=Min_Falling(mat,i+1,j-1,dp);
        int rd=Min_Falling(mat,i+1,j+1,dp);
        return dp[i][j]=mat[i][j]+Math.min(down,Math.min(ld,rd));
    }
}