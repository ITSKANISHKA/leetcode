class Solution {
    public int count(int rw,int cl,int[][] grid){
        if(rw<0|| cl<0 || rw>=grid.length || cl>=grid[0].length||grid[rw][cl] == 0)return 0;
        int area=1;
        grid[rw][cl]=0;
        int[] dr={0,0,1,-1};
        int[] dc={1,-1,0,0};

        for(int i=0;i<4;i++){
            int newR=rw+dr[i];
            int newC=cl+dc[i];
            area+=count(newR,newC,grid);
        }return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int result=0;
        int n=grid.length;
        int m=grid[0].length;
        if(n==0)return result;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int area=count(i,j,grid);
                    result=Math.max(result,area);
                }
            }
        }return result;
    }
}