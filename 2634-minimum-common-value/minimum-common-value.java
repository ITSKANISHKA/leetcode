class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set2 = new HashSet<>();
        for(int a : nums2){
            set2.add(a);
        }
        int min = Integer.MAX_VALUE;
        for(int i : nums1){
            if(set2.contains(i)){
                min=Math.min(min, i);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}