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
        
        
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null); // level end marker
        
        List<Integer> temp = new ArrayList<>();

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                ans.add(new ArrayList<>(temp));
                temp.clear();

                if (!q.isEmpty()) {
                    q.add(null); // next level marker
                }
            } 
            else {
                temp.add(curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        return ans;
    }
}
        