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
    public int sumNumbers(TreeNode root) {
        
        int sum = 0;
        String append = "";
        return helper(root, sum, append);
        
    }
    
    public int helper(TreeNode root, int sum, String append)
    {   
        // Leaf node found. Append the leaf node value to string
        // And return the final string in integer format back to the parent node.
        if(root != null && root.left == null && root.right == null)
        {   
            // Inside main logic, nodes are appended only if its not a leaf node
            // So for leaf node its done here.
            append = append + Integer.toString(root.val);
            return (int)Integer.parseInt(append);    
        }
        
        // PreOrder Traversal
        if(root != null)
        {   
            // Keep appending node values to the string, if its not a leaf node.
            append = append + Integer.toString(root.val);
            
            // Recursively do the same for left and right nodes.
            int left = helper(root.left, sum, append);
            int right = helper(root.right, sum, append);
            
            // Change sum value obtained from left and right nodes,
            // This is done at parent node level. After completion of left and right nodes.
            sum = left + right;
        }
        return sum;
    }
    
}