class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        String tar = word;
        while(sequence.contains(tar)){
            c++;
            tar = tar+word;
        }
        return c;
    }
}