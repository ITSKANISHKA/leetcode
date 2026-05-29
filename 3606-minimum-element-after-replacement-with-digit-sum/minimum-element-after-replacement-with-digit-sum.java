class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] arrSum = new int[n];

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            arrSum[i] = sum;
        }

        return minimum(arrSum);
    }
    public static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}