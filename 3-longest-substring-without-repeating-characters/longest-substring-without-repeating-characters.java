class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> chrset=new HashSet<>();
       int n=s.length();
       int num=0;
       int max=0;
       for(int i=0;i<n;i++){
            if(!chrset.contains(s.charAt(i))){
                chrset.add(s.charAt(i));
                max=Math.max(max,i-num+1);

            }else{
                while(chrset.contains(s.charAt(i))){
                    chrset.remove(s.charAt(num));
                    num++;
                }
                chrset.add(s.charAt(i));
            }
        }return max;
    }
}