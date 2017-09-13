/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int smallest = Integer.MAX_VALUE;
    private int second_smallest = Integer.MAX_VALUE;
    private boolean has_second_smallest = false;
    public int findSecondMinimumValue(TreeNode root) {
        helperFindSecondMinValue(root);
        return has_second_smallest? second_smallest : -1;
    }
    
    public void helperFindSecondMinValue(TreeNode root) {
        // return if root is empty
        if (root == null) {
            return;
        }
    
        // Only update two values if root.val is smaller than any of them and not equal
        if (root.val < smallest) {
            second_smallest = smallest;
            smallest = root.val;
        } else if (root.val > smallest && root.val < second_smallest) {
            second_smallest = root.val;
            has_second_smallest = true;
        }
        
        // Recurse down
        helperFindSecondMinValue(root.left);
        helperFindSecondMinValue(root.right);
    }
}