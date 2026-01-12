class Solution {
    private int mxHistArea(int []arr, int n){
        Deque<Integer> st = new ArrayDeque<>();
        int mxarea = 0;
        st.offerFirst(-1);
        for(int i=0;i<n;i++){
            int x = arr[i];
            while(st.peekFirst()!=-1 && arr[st.peekFirst()] > x){
                int y = st.pollFirst();
                mxarea = Math.max(mxarea, arr[y] * (i-st.peekFirst()-1));
            }
            st.offerFirst(i);
        }
        while(st.peekFirst()!=-1){
            int y = st.pollFirst();
            mxarea = Math.max(mxarea, arr[y] * (n-st.peekFirst()-1));
        }
        return mxarea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m  = matrix[0].length;
        int presum [] = new int[m];
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='0') presum[j] = 0;
                else presum[j]++;
            }
            ans = Math.max(ans,mxHistArea(presum,m));
        }
        return ans;
    }
}