class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        
        // Maintain two stacks, store node & store update value till that node
        Stack <TreeNode> nodes = new Stack <TreeNode>();
        Stack <Integer> values = new Stack <Integer>();
        
        dfs(root, nodes, values);
        return sum;
    }
    
    public void dfs(TreeNode root, Stack<TreeNode> nodes, Stack<Integer> values)
    {   
        // Proceed dfs by adding root node and its value if it exists.
        if(root != null){
            nodes.push(root);
            values.push(root.val);
        }
        
        while(!nodes.isEmpty())
        {   
            
            // Pop both node and updated value
            TreeNode node = nodes.pop();
            int val = values.pop();
            
            // If leaf node is reache then update sum.
            if(node.left == null && node.right == null)
            {
                sum+=val;
            }
            // Add its children nodes with updated values.
            // Ex: if root is 4 and left child is 9 then push(4*10 + 9)
            if(node.left != null)
            {
                nodes.push(node.left);
                values.push(val*10 + node.left.val);
            }
            if(node.right != null)
            {
                nodes.push(node.right);
                values.push(val*10 + node.right.val);
            }
        }
    } 
}