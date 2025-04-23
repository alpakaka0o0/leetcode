# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    maxNum = -1001

    def dfs(self, root):
            if not root:
                return 0

            
            leftValue = max(self.dfs(root.left), 0)
            rightValue = max(self.dfs(root.right), 0)

            self.maxNum = max(self.maxNum, leftValue + rightValue + root.val)
        
            return root.val + max(leftValue, rightValue)

    def maxPathSum(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        
        self.dfs(root)

        return self.maxNum