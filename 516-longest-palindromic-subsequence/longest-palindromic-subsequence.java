class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp=new int[s.length()][s.length()];
        for(int[] num:dp)Arrays.fill(num,-1);
        return Solve(s,0,s.length()-1,dp);
        
    }
    public static int Solve(String s,int i,int j,int[][] dp){
        if(i>j)return 0;
        if(i==j)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=0;
            if(s.charAt(i)==s.charAt(j)){
                ans =2+Solve(s,i+1,j-1,dp);
            }else{
                int npick=Solve(s,i+1,j,dp);
                int npick1=Solve(s,i,j-1,dp);
                ans=Math.max(npick1,npick);
            }return dp[i][j]=ans;
    }
}