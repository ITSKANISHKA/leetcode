// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n=nums1.length;
//         int m=nums2.length;
//         int[] arr=new int[n+m];
//         int i=0;
//         int j=0;
//         for(int k=0;k<arr.length;k++){
//             while(i < n && j < m){
//                 if(nums1[i]>nums2[j]){
//                     arr[k]=nums2[i];
//                     i++;
//                 }else{
//                     arr[k]=nums1[j];
//                     j++;
//                 }
//             }
//         }
//         int len=arr.length;
//         double med=0;
//         if(len%2==0){
//             med=(arr[len/2]+arr[(len/2)-1])/2.0;
//         }else{
//             med=(arr[len/2]);
//         }return med;
        
//     }
// }
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];
        int i = 0, j = 0;
        for (int k = 0; k < arr.length; k++) {

            if (i < n && j < m) {
                if (nums1[i] <= nums2[j]) {
                    arr[k] = nums1[i];
                    i++;
                } else {
                    arr[k] = nums2[j];
                    j++;
                }
            }
            else if (i < n) {
                arr[k] = nums1[i];
                i++;
            }
            else {
                arr[k] = nums2[j];
                j++;
            }
        }
        int len = arr.length;
        if (len % 2 == 0) {
            return (arr[len/2] + arr[(len/2) - 1]) / 2.0;
        } else {
            return arr[len/2];
        }
    }
}
