class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        for (int key : map.keySet()) {
            int r=map.get(key);
            if(r==1)return -1;
            count += r/ 3;
            if (r % 3 != 0) count++;
        }return count;
    }

}