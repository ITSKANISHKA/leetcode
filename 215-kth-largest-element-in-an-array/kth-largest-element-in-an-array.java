class Solution {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<nums.length;i++){
        pq.offer(nums[i]);
    }
    for(int j=0;j<k-1;j++){
        pq.poll();
    }
    int kth=pq.peek();
    return kth;
    }
}