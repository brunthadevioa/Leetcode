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

    int count = 0;
    public int countDominantNodes(TreeNode root) {

        dfs(root);

        return count;
        
    }

    int dfs(TreeNode root){

        if(root==null){

            return Integer.MIN_VALUE;
        }

        int lm = dfs(root.left);

        int rm = dfs(root.right);

        int max = Math.max(root.val,Math.max(lm,rm));

        if(root.val==max){

            count++;
        }

        return max;
    }
}