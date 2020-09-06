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
    public TreeNode invertTree(TreeNode root) {
        
        
        if(root == null) return root;
        
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        
        root.right = left;
        root.left = right;
        
        return root;
        
    }
}


// Solution 2

class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null)
            return null;
        if(root != null)
        {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left != null)
                invertTree(root.left);
            if(root.right != null)
                invertTree(root.right);
        }
        return root;
    }
}