class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> small=new HashSet<>();
        HashSet<Character> cap=new HashSet<>();
        HashSet<Character> valid=new HashSet<>();
        for (char ch:word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                small.add(ch);
            } else if (Character.isUpperCase(ch)) {
                cap.add(ch);
            }
        }
        for (char low:small) {
            char up=Character.toUpperCase(low);
            if (cap.contains(up)) {
                valid.add(low); 
            }
        }
        return valid.size();
    }
}