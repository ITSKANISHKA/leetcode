class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        char st[]=s.toCharArray();
        for( char ch : st){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<st.length;i++){
            if(map.get(st[i])==1){
                return i;
            }
        }return -1;
        
    }
}