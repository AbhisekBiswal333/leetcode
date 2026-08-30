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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left_diameter = diameterOfBinaryTree(root.left);
        int lh=height(root.left);
        int right_diameter = diameterOfBinaryTree(root.right);
        int rh=height(root.right);
        int self_diam=lh+rh;
        int maxi = Math.max(self_diam,Math.max(left_diameter,right_diameter));
        return maxi;
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left_height = height(root.left);
        int right_height = height(root.right);
       int height=Math.max(left_height,right_height)+1;
      return height;
    }
    
}