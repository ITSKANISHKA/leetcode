class Solution {
    class Pair{
        int row,col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] dist=new int[n][m];
        Queue<Pair> q=new LinkedList<>();

        int[] Drow={-1,1,0,0};
        int[] Dcol={0,0,-1,1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j));
                    dist[i][j]=0;
                }else{
                    dist[i][j]=-1;
                }
            }
        }
         while(!q.isEmpty()){
            Pair curr=q.poll();
            int row=curr.row;
            int col=curr.col;
            for(int k=0;k<4;k++){
                int newR=row+Drow[k];
                int newC=col+Dcol[k];
                if(newR>=0 && newR<n && newC>=0 && newC<m && dist[newR][newC]==-1){
                    dist[newR][newC]=dist[row][col]+1;
                    q.add(new Pair(newR,newC));
                }
            }
         }return dist;
    }
}