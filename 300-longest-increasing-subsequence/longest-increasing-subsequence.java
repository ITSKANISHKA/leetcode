class Solution {

    public int lengthOfLIS(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int[] dp = new int[arr.length];
        int len = 1;
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > dp[len - 1]) {
                dp[len] = arr[i];
                len++;
            } else {
                int idx = lowerBound(dp, 0, len - 1, arr[i]);
                dp[idx] = arr[i];
            }
        }
        return len;
    }
    private static int lowerBound(int[] dp, int si, int ei, int item) {
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (dp[mid] >= item) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return si;
    }
}
