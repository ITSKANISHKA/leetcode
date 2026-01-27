class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        List<Integer>[] arr = new ArrayList[101];
        for (int i = 0; i < arr.length; i++)
            arr[i] = new ArrayList<Integer>();
        for (int[] rec : rectangles)
            arr[rec[1]].add(rec[0]);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != arr.length - 1)
                arr[i].addAll(arr[i + 1]);
            Collections.sort(arr[i]);
        }
        int[] res = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            int idx = bSearch(arr[points[i][1]], points[i][0]);
            res[i] = arr[points[i][1]].size() - idx;
        }
        return res;
    }
    int bSearch(List<Integer> list, int n) {
        int l = 0, r = list.size();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (n > list.get(mid))
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
}