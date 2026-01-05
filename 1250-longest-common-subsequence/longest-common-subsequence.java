class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] num:dp){
            Arrays.fill(num,-1);
        }
        return Solve(text1,text2,0,0,dp);
        
    }
    public static int Solve(String s,String t,int i,int j,int[][] dp){
        if(i==s.length()||j==t.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=1+Solve(s,t,i+1,j+1,dp);
        }else{
            int npick=Solve(s,t,i+1,j,dp);
            int npick2=Solve(s,t,i,j+1,dp);
            ans=Math.max(npick,npick2);
        }
        return dp[i][j]=ans;
    }
}