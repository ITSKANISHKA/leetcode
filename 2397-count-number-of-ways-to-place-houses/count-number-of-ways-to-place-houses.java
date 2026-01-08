class Solution {
    static long mod = 1000000007L;
    public long fun(int n, long dp[]) {
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return 2;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        long left = 0, right = 0;
        left = fun(n-1, dp);
        right = fun(n-2, dp);
        return dp[n] = (left + right) % mod;
    }
    public int countHousePlacements(int n) {
        long dp[] = new long[n+1];
        Arrays.fill(dp, -1);
        long res = fun(n, dp);
        return (int)((res*res) % mod);
    }
}