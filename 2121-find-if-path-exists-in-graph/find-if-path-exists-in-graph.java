class Solution {
    public boolean Solve(List<List<Integer>> gph,int source,int destination,int[]visited) {
        if(source==destination)return true;
        visited[source]=1;
        for(int neigh:gph.get(source)){
            if(visited[neigh]==0){
                if(Solve(gph,neigh,destination,visited)){
                    return true;
                }
            }
        }return false;
    }
    public boolean validPath(int n,int[][] edges,int source,int destination){
        List<List<Integer>> gph=new ArrayList<>();
        for(int i=0;i<n;i++){
            gph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            gph.get(edge[0]).add(edge[1]);
            gph.get(edge[1]).add(edge[0]);
        }
        int[] visited=new int[n];
        return Solve(gph,source,destination,visited);
    }
}