/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    private static int counter = 0;
    private static int ret = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        counter = k;
        helper(root);
        return ret;
    }
    
    //subtract counter one by one and return 
    //if needs return, then if k is big, never returns
    public void helper(TreeNode n) {
        if (n.left != null) {
            helper(n.left);
        }
        counter--;
        if (counter == 0) {
            ret = n.val;
            return;
        }
        if (n.right != null) {
            helper(n.right);
        }
    }
}