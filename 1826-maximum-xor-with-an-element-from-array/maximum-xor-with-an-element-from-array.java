class Pair {
    int x, y, idx;
    Pair(int x, int y, int idx) {
        this.x = x;
        this.y = y;
        this.idx = idx;
    }
}

class Node {
    Node[] link = new Node[2];
    boolean containsKey(int bit) { return link[bit] != null; }
    Node get(int bit) { return link[bit]; }
    void put(int bit, Node node) { link[bit] = node; }
}

class Trie {
    private Node root;
    Trie() { root = new Node(); }

    void insert(int num) {
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.containsKey(bit)) {
                node.put(bit, new Node());
            }
            node = node.get(bit);
        }
    }

    int getMax(int num) {
        int max = 0;
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.containsKey(1 - bit)) {
                node = node.get(1 - bit);
                max |= (1 << i);
            } else {
                node = node.get(bit);
            }
        }
        return max;
    }
}
class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.y - b.y);
        for (int i = 0; i < queries.length; i++) {
            pq.add(new Pair(queries[i][0], queries[i][1], i));
        }

        Trie trie = new Trie();
        int i = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            int num = curr.x, limit = curr.y, idx = curr.idx;

            while (i < nums.length && nums[i] <= limit) {
                trie.insert(nums[i]);
                i++;
            }

            if (i == 0) ans[idx] = -1;
            else ans[idx] = trie.getMax(num);
        }
        return ans;
    }
}