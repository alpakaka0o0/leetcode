# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    
    
    def buildTree(self, inorder, postorder):
        """
        :type inorder: List[int]
        :type postorder: List[int]
        :rtype: Optional[TreeNode]
        """
        if not inorder:
            return None
        
        left = []
        right = []
        parentVal = postorder.pop()
        
        for i in range(len(inorder)):
            if inorder[i] == parentVal:
                left = inorder[:i]
                right = inorder[i+1:]
                break
        parent = TreeNode(parentVal)
        parent.right = self.buildTree(right, postorder)
        parent.left = self.buildTree(left, postorder)

        return parent
        

        # inorder : 왼 -> 루트 -> 오
        # postorder : 왼 -> 오 -> 루트