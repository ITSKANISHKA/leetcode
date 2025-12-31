class Solution {
    int R, C;
    int[] dx = {1,-1,0,0}, dy = {0,0,1,-1};
    boolean canCross(int day, int[][] cells) {
        int[][] grid = new int[R][C];
        for (int i = 0; i < day; i++)
            grid[cells[i][0]-1][cells[i][1]-1] = 1;
        boolean[][] vis = new boolean[R][C];
        Queue<int[]> q = new LinkedList<>();
        for (int j = 0; j < C; j++) {
            if (grid[0][j] == 0) {
                q.add(new int[]{0, j});
                vis[0][j] = true;
            }
        }
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == R-1) return true;
            for (int k = 0; k < 4; k++) {
                int nx = cur[0] + dx[k], ny = cur[1] + dy[k];
                if (nx>=0 && nx<R && ny>=0 && ny<C && !vis[nx][ny] && grid[nx][ny]==0) {
                    vis[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return false;
    }
    public int latestDayToCross(int row, int col, int[][] cells) {
        R = row; C = col;
        int lo = 1, hi = cells.length, ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if (canCross(mid, cells)) {
                ans = mid;
                lo = mid + 1;
            } else hi = mid - 1;
        }
        return ans;
    }
}