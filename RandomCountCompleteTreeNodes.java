/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//first count level
//DFS right until level matches
//total expected - missed
public class Solution {
    int level = 0;
    int missing = 0;
    int curlevel = 0;
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode temp = root;
        while (temp != null) {
            level++;
            temp = temp.left;
        }
        dfs(root);
        return ((int)Math.pow(2,level) - 1 - missing);
    }
    
    public void dfs(TreeNode n) {
        curlevel++;
        if (curlevel == level) {
            if (n == null) {
                missing++;
            }
        }
        if (n != null) {
            dfs(n.right);
            dfs(n.left);
        }
        curlevel--;
    }
    
}