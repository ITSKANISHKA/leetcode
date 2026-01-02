class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        int counter = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                map.put(counter, i);
                counter++;
            }            
        }
        for(int i=0;i<queries.length;i++){
            if(map.containsKey(queries[i])){
                queries[i]=map.get(queries[i]);
            }else{
                queries[i]=-1;
            }
        }return queries;
    }
}