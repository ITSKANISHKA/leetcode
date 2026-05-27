class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set0=new HashSet<>();

        for(int i:nums1){
            set.add(i);
        }
        for(int j:nums2){
            set0.add(j);
        }        
        int cnt1=0;
        int cnt2=0;
        for(int x:nums1) {
            if(set0.contains(x)) {
                cnt1++;
            }
        }
        for(int x:nums2) {
            if(set.contains(x)) {
                cnt2++;
            }
        }
        return new int[]{cnt1,cnt2};
    }
}