class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
    int i = 0;
    int profit = 0;

    while(i < n-1){

        while(i < n-1 && arr[i] >= arr[i+1])
            i++;

        int buy = arr[i];

        while(i < n-1 && arr[i] <= arr[i+1])
            i++;

        int sell = arr[i];

        profit += sell - buy;
    }

    return profit;
    }
}