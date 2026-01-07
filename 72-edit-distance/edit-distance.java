class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for(int[] num:dp){
            Arrays.fill(num,-1);
        }
        return Solve(word1,word2,0,0,dp);
    }
    public static int Solve(String s,String t,int i,int j,int[][] dp){
        if(i==s.length())return t.length()-j;
        if(j==t.length())return s.length()-i;
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=Solve(s,t,i+1,j+1,dp);
        }else{
            int d=Solve(s,t,i+1,j,dp);
            int in=Solve(s,t,i,j+1,dp);
            int r=Solve(s,t,i+1,j+1,dp);
            ans=1+Math.min(d,Math.min(in,r));
        }return dp[i][j]=ans;
    }
}
