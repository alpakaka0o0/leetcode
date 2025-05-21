# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """

        if not root:
            return []

        q = collections.deque()
        q.append(root)
        ans = []
        even_level = False

        while q:
            qlen = len(q)
            temp = []
            for _ in range(qlen):
                curr = q.popleft()
                temp.append(curr.val)
                if curr.right:    
                    q.append(curr.right)
                if curr.left:    
                    q.append(curr.left)
            if not even_level:
                temp = temp[::-1]
            ans.append(temp)
            even_level = not even_level

        return ans
        