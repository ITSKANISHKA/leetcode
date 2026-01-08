class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int [] num: dp){
            Arrays.fill(num,-1);
        }
        return Solve(grid,0,0,dp);
    }
    public static int Solve(int[][]grid,int i,int j,int[][]dp){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if (i >= grid.length || j >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int down=Solve(grid,i+1,j,dp);
        int right=Solve(grid,i,j+1,dp);
        dp[i][j]=grid[i][j]+Math.min(right,down);
        return dp[i][j];
    }
}