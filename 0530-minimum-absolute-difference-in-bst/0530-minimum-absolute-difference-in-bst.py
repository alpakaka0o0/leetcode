# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def dfs(self, root, parents, ans):
        if not root:
            return ans
        for parent in parents:
            temp = abs(parent - root.val)
            if temp < ans:
                ans = temp
            
        parents.append(root.val)
        if root.left:
            ans = self.dfs(root.left, parents, ans)
        if root.right:
            ans = self.dfs(root.right, parents, ans)
            
        return ans

    
    def getMinimumDifference(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        parents = []
        ans = (100000) + 1
        ans = self.dfs(root, parents, ans)
        
        return ans

        