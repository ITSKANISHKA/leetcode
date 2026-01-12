class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int ttime=0;
        for(int i=1;i<n;i++){
            //int m=points[i].length;
            int x1=points[i-1][0];
            int y1=points[i-1][1];
            int x2=points[i][0];
            int y2=points[i][1];
            int dx=Math.abs(x2-x1);
            int dy=Math.abs(y2-y1);
            ttime+=Math.max(dx,dy);

        }return ttime;
    }
}