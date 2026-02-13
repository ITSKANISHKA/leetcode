class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 1,len = 1;
        for(int i=1;i<n;i++) {
            if(s.charAt(i) == s.charAt(i-1)) len++;
            else len = 1;
            maxLen = Math.max(maxLen,len);
        }
        int len1 = solve(s,'a','b','c');
        int len2 = solve(s,'a','c','b');
        int len3 = solve(s,'b','c','a');
        maxLen = Math.max(maxLen,Math.max(len1,Math.max(len2,len3)));
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("0#0",-1);
        int[] cnt = new int[3];
        for(int i=0;i<n;i++) {
            cnt[s.charAt(i) - 'a']++;
            int cnt_ab = cnt[0] - cnt[1];
            int cnt_ac = cnt[0] - cnt[2];
            String key = cnt_ab + "#" + cnt_ac;
            if(hashMap.containsKey(key)) maxLen = Math.max(maxLen,i - hashMap.get(key));
            else hashMap.put(key,i);
        }

        return maxLen;
    }
    public int solve(String s,char ch1,char ch2,char resetChar) {
        int maxLen = 0;
        String[] segments = s.split(String.valueOf(resetChar), -1);
        for(String segment : segments) {
            if(segment.isEmpty()) continue;
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            hashMap.put(0,-1);
            int sum = 0;
            for(int i=0;i<segment.length();i++) {
                char ch = segment.charAt(i);
                if(ch == ch1) sum++;
                else if(ch == ch2) sum--;
                if(hashMap.containsKey(sum)) maxLen = Math.max(maxLen,i - hashMap.get(sum));
                else hashMap.put(sum,i);
            }
        }
        return maxLen;
    }
}