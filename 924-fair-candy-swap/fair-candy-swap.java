class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0;
        int sumB=0;
        HashSet<Integer> Bob=new HashSet<>();
        for(int i=0;i<aliceSizes.length;i++){
            sumA+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sumB+=bobSizes[i];
        }
        int diff=(sumB-sumA)/2;
        for(int i:bobSizes){
            Bob.add(i);
        }
        for(int k:aliceSizes){
            int need=k+diff;
            if(Bob.contains(need)){
                return new int[]{k,need};
            }
        }
        return new int[0];
    }
}