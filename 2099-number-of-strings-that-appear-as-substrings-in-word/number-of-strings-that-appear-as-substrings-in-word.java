class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res=0;
        for(String chr:patterns){
            if(word.indexOf(chr)!=-1){
                res++;
            }
        }return res;
    }
}