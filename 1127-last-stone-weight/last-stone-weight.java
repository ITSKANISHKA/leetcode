class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int num:stones){
            pq.add(num);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b =pq.poll();
            int c = a-b;
            if(c!=0)
                pq.add(c);
        } 
        if(pq.size()!=0) 
            return pq.poll();
        return 0;
    }
}