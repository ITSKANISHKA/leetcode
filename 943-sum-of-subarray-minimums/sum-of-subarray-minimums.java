class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=1_000_000_007;

        int[] pse=new int[n];
        int[] nse=new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();

        for(int j=n-1;j>=0;j--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[j]){
                st.pop();
            }nse[j] = st.isEmpty() ? n : st.peek();
            st.push(j);
        }

        long res = 0;
        for(int i = 0 ;i < n ; i++){
            long left =i - pse[i];
            long right = nse[i] - i ;
            res = (res + arr[i] * left * right) % mod;

        }return (int) res;
        
    }
}