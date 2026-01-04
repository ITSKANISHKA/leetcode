class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++) Arrays.fill(dp[i], -1);
        return solve(word1, word2, 0, 0, dp);
    }
    private int solve(String s, String t, int i, int j, int[][] dp) {
        if(i == s.length()) return t.length() - j;
        if(j == t.length()) return s.length() - i; 

        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == t.charAt(j)) {
            dp[i][j] = solve(s, t, i+1, j+1, dp);
        } else {
            int insert = 1 + solve(s, t, i, j+1, dp);
            int delete = 1 + solve(s, t, i+1, j, dp);
            int replace = 1 + solve(s, t, i+1, j+1, dp);
            dp[i][j] = Math.min(insert, Math.min(delete, replace));
        }
        return dp[i][j];
    }
}
