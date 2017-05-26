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
    public int countNodes(TreeNode root) {
        int h = height(root);
        if (h == 0) {
            return 0;
        }
        if (height(root.right) == h-1) {
            return ((1<<h-1) + countNodes(root.right));
        } else {
            //height(root.right) == h-2
            return ((1<<h-2) + countNodes(root.left));
        }
    }
    
    public int height(TreeNode n) {
        int count = 0;
        while (n != null) {
            count++;
            n = n.left;
        }
        return count;
    }
}