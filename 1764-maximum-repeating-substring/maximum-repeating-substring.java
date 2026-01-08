class Solution {
    public int maxRepeating(String sequence, String word) {
        int[] dp = new int[sequence.length()];
        Arrays.fill(dp, -1);
        int ans = 0;
        for (int i = 0; i < sequence.length(); i++) {
            ans = Math.max(ans, solve(sequence, word, i, dp));
        }
        return ans;
    }
    public static int solve(String s, String w, int i, int[] dp) {
        if (i + w.length() > s.length()) return 0;
        if (dp[i]!=-1) return dp[i];

        if (s.startsWith(w, i)) {
            dp[i]=1+solve(s,w,i +w.length(),dp);
        } else {
            dp[i]=0;
        }
        return dp[i];
    }
}
