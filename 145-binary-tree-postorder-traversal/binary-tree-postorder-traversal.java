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
    List<Integer> li=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        insert(root);
        return li;
    }
    public void insert(TreeNode root){
        if(root!=null){
        insert(root.left);
        insert(root.right);
        li.add(root.val);
    }
    }
}