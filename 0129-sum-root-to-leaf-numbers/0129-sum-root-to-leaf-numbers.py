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

        if not root.left and not root.right: # 둘 다 없음
            sumNum += int(curNum)
        elif root.left and root.right:
            sumNum += self.Numbers(root.left, curNum, sumNum) + self.Numbers(root.right, curNum, sumNum)
        elif root.left: # left 만 존재
            sumNum += self.Numbers(root.left, curNum, sumNum) 
        elif root.right: # right 만 존재
            sumNum += self.Numbers(root.right, curNum, sumNum)

        return sumNum 

    def sumNumbers(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        sumNum = self.Numbers(root, "0", 0) 

        return sumNum