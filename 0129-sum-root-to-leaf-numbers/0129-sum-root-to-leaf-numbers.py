# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def Numbers(self, root, curNum, sumNum):
        if not root:
            return int(curNum)
        
        curNum += str(root.val)
        print(root.val, curNum, sumNum)

        sumNum += self.Numbers(root.left, curNum, sumNum) + self.Numbers(root.right, curNum, sumNum) 

        return sumNum 

    def sumNumbers(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        sumNum = self.Numbers(root, "", 0) // 2

        return sumNum