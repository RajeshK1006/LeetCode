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
    public int sumRootToLeaf(TreeNode root) {
        return helper(root,0);
    }
    int helper(TreeNode root, int val){
        if (root == null){
            return 0;
        }

        val = val << 1 | root.val;

        if(root.left == null && root.right == null){
            return val;
        }

        return helper(root.right , val)+ helper(root.left,val);
    }
}