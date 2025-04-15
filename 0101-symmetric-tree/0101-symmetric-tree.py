# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def traversalNode(self, left, right):

        if left.val != right.val:
            return False

        if left.left != None and right.right != None:
            if not self.traversalNode(left.left, right.right):
                return False
        elif left.left or right.right:
                return False

        if left.right != None and right.left != None:
            if not self.traversalNode(left.right, right.left):
                return False
        elif (left.right or right.left):
            return False
        return True


    def isSymmetric(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        if root == None:
            return true
        
        leftNode = root.left
        rightNode = root.right
        if leftNode == None and rightNode == None:
            return True
        elif leftNode and rightNode:
            return self.traversalNode(leftNode, rightNode)
        else:
            return False
        
        