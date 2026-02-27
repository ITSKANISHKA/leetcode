class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookies=s.length;
        int child=g.length;
        int i=0;
        int j=0;
        while(i<cookies && j<child){
            if(s[i]>=g[j]){
                j++;
            }
            i++;
        }return j;
    }
}