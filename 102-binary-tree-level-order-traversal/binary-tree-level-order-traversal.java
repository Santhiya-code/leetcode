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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        if(root==null){
            return l1;
        }
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> l2=new ArrayList<>();
            int Qu=qu.size();
            for(int i=0;i<Qu;i++){
                TreeNode temp=qu.poll();
            l2.add(temp.val);
            if(temp.left!=null){
                qu.add(temp.left);
            }
            if(temp.right!=null){
                qu.add(temp.right);
            }
            }
            l1.add(l2);
        }
        return l1;
    }
}