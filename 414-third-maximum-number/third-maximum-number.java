class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());
        for (int x : set) {
            pq.add(x);
        }
        if (pq.size() < 3) {
            return pq.peek(); 
        }
        pq.poll();
        pq.poll();
        return pq.peek();
    }
}
