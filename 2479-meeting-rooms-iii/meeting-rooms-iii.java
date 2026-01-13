class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int c[]=new int[n];
        long bk[] =new long[n];
        Arrays.sort(meetings,(a,b)->(a[0]-b[0]));
        for(int i=0;i<meetings.length;i++){
            int start=meetings[i][0];
            int end=meetings[i][1];
            boolean assign=false;
            int rooms=-1;
            long ear=Long.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(bk[j]<ear){
                    ear=bk[j];
                    rooms=j;
                }
                if(bk[j]<=start){
                    bk[j]=end;
                    c[j]++;
                    assign=true;
                    break;
                }
            }if(!assign){
                bk[rooms]+=(end-start);
                c[rooms]++;
            }
        }int idx=0;
         int max=0;
            for(int k=0;k<c.length;k++){
                if(c[k]>max){
                    max=c[k];
                    idx=k;
                }
            }return idx;
    }
}