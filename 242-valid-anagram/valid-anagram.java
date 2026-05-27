
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        for(char ch:arr1) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for(char ch:arr2) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        return map1.equals(map2);
    }
}