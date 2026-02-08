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
class Solution {
    public boolean isBalanced(TreeNode root) {
        return Solve(root)!=-1;
        
    }
    public static int Solve(TreeNode root){
        if(root==null)return 0;
        int leftNode=Solve(root.left);
        if(leftNode==-1)return -1;
        int rightNode=Solve(root.right);
        if(rightNode==-1)return -1;

        if(Math.abs(leftNode-rightNode)>1)return -1;
        return Math.max(leftNode,rightNode)+1;


    }
}