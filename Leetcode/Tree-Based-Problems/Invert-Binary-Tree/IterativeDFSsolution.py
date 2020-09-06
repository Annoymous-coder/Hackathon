# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        stack = []
        stack.append(root)
        while stack:
            node = stack.pop()
            if node:
                node.right, node.left = node.left, node.right
                stack.append(node.left)
                stack.append(node.right)
        return root
    
            
        