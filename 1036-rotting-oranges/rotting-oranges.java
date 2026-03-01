class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
       Queue<Pair> q=new LinkedList<Pair>();
       int n=grid.length;
       int m=grid[0].length;
       int count=0;
       int maxTime=0;
       int[][] visited=new int[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                q.add(new Pair(i,j,0));
                visited[i][j]=2;
            }
            else{
                visited[i][j]=0;
            }
            if(grid[i][j]==1)count++;
        }
       }

       int[] dRow = {1, 0, -1, 0};
        int[] dCol = {0, 1, 0, -1};

        // Step 2: BFS
        while(!q.isEmpty()) {
            Pair cur = q.poll();
            int r = cur.row;
            int c = cur.col;
            int t = cur.time;

            maxTime = Math.max(maxTime, t);

            for(int k = 0; k < 4; k++) {
                int nr = r + dRow[k];
                int nc = c + dCol[k];

                if(nr >= 0 && nc >= 0 && nr < n && nc < m &&
                   visited[nr][nc] == 0 && grid[nr][nc] == 1) {

                    visited[nr][nc] = 2;
                    count--;
                    q.add(new Pair(nr, nc, t + 1));
                }
            }
        }
        if(count > 0) return -1;
        return maxTime;
    }
}