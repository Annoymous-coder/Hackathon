class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
       
       // Using a helper function since a flag was required which persists data.
       return helper(root,sum,false);
    }
    public boolean helper(TreeNode root, int sum, boolean flag)
    {   
        // When it is a leaf node, having required data. Update flag to true.
        if(root!=null && root.left == null && root.right==null && root.val == sum){
		
			flag = true;
		}
        // When it's a leaf node and not having required data, just setting flag as false 
        // Would return final answer as false since true would get overwritten.
        // So if its true before carry forward true only.
		else if(root!=null && root.left == null && root.right==null && root.val != sum){
			flag = flag == true ? true : false;
		}
		if(root != null)
		{   
            // Update flags before calling subfunction, since flag would have changed.
            // Cannot use default false everywhere.
			flag = helper(root.left, sum - root.val, flag);
			flag = helper(root.right, sum - root.val, flag);
		}
		return flag;
    }
}