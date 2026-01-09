// class Solution {
//     public String frequencySort(String s) {
//         HashMap<Character,Integer> set=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             set.put(s.charAt(i),set.getOrDefault(s.charAt(i),0)+1);
//         }
//         String t="";
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<s.length();i++){
//             if(set.get(i)>max){
//                 max=set.get(s.charAt(i));
//             }
//         }
        
//     }
// }
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> pq =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int freq = map.get(ch);
            while (freq-- > 0) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
