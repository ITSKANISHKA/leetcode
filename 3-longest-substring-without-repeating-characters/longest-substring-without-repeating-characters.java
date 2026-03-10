class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> set=new HashSet<>();
      int sum=0;
      int max=0;
      int n=s.length();
      for(int i=0;i<n;i++){
        if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i));
            max=Math.max(max,i-sum+1);
        }
        else{
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(sum));
                sum++;
            }set.add(s.charAt(i));
        }
      }  return max;
    }
  
}