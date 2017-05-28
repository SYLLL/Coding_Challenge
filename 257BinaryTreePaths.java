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
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<String>();
        }
        if (root.left == null && root.right == null) {
            List<String> l = new ArrayList<String>();
            l.add(String.valueOf(root.val));
            return l;
        }
        if (root.left == null) {
            List<String> right = binaryTreePaths(root.right);
            int size = right.size();
            for (int i = 0; i < size; i++) {
                right.set(i, String.valueOf(root.val) + "->" + right.get(i));
            }
            return right;
        }
        if (root.right == null) {
            List<String> left = binaryTreePaths(root.left);
            int size = left.size();
            for (int i = 0; i < size; i++) {
                left.set(i, String.valueOf(root.val) + "->" + left.get(i));
            }
            return left;
        }
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        int sizel = left.size();
        int sizer = right.size();
        for (int i = 0; i < sizer; i++) {
                right.set(i, String.valueOf(root.val) + "->" + right.get(i));
        }
        for (int i = 0; i < sizel; i++) {
                left.set(i, String.valueOf(root.val) + "->" + left.get(i));
        }
        List<String> newList = new ArrayList<String>(left);
        newList.addAll(right);
        return newList;
    }
}