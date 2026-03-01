class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        if(grid==null || n==0)return -1;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    dfs(grid,i,j,2);
                }
            }
        }
        int ans=2;
        for(int[] row:grid){
            for(int col:row){
                if(col==1)return -1;
                ans=Math.max(ans,col);
            }
        }return ans-2;
        
    }
    public static void dfs(int[][] grid,int i,int j,int ans){
        
        if(i>=grid.length || i<0 || j<0||j>=grid[0].length || grid[i][j]==0 || (grid[i][j]>1 && grid[i][j]<ans))return;
        else{

        
        grid[i][j]=ans;
        
            dfs(grid,i+1,j,ans+1);
            dfs(grid,i,j+1,ans+1);
            dfs(grid,i-1,j,ans+1);
            dfs(grid,i,j-1,ans+1);
        }
    }
}