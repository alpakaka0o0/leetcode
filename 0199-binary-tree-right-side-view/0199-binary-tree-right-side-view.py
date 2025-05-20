# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def bfs(self, root, ans, depth):
        if not root:
            return ans
        if len(ans) < depth:
            ans.append(root.val)
        ans = self.bfs(root.right, ans, depth+1)
        ans = self.bfs(root.left, ans, depth+1)
        return ans

    
    def rightSideView(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        ans = []
        if not root:
            return ans
        ans = self.bfs(root, ans, 1)

        return ans
        
        