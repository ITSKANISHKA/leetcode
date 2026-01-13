class Solution {
    public int maxProfit(int[] prices) {
       int min1=Integer.MAX_VALUE;
       int profit=0;
       int n=prices.length;
       for(int i=0;i<n;i++){
        if(prices[i]<min1){
            min1=prices[i];
        }else if(prices[i]-min1>profit){
            profit=prices[i]-min1;
        }
       }return profit;
    }
}