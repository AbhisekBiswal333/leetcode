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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>result=new ArrayList<>();
        postorder(result,root);
        return result;
    }
    public static void postorder(ArrayList<Integer>al,TreeNode node){
        if(node==null){
            return;
        }
        postorder(al,node.left);
        postorder(al,node.right);
        al.add(node.val);
    }
}