/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;

        int LeftNode=maxDepth(root.left);
        int rightNode=maxDepth(root.right);  
        return 1+(Math.max(rightNode,LeftNode));  
    }
}