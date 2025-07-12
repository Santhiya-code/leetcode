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
    public List<Integer> inorderTraversal(TreeNode root) {
        insert(root);
        return li;
    }
        public  void insert(TreeNode root){
        if(root!=null){
            insert(root.left);
             li.add(root.val);
            insert(root.right);
        }
    }
}