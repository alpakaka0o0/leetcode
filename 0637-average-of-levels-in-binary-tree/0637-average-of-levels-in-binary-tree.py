# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def bfs(self, root, sum_cnt, depth):
        if not root:
            return sum_cnt
        if depth >= len(sum_cnt):
            sum_cnt.append([root.val, 1])
        else:
            sum_cnt[depth][0] += root.val
            sum_cnt[depth][1] += 1
        
        sum_cnt = self.bfs(root.left, sum_cnt, depth+1)
        sum_cnt = self.bfs(root.right, sum_cnt, depth+1)

        return sum_cnt


    def averageOfLevels(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[float]
        """
        sum_cnt = [] # it will be saved the value like [(sum, cnt)]

        if not root:
            return root
        sum_cnt = self.bfs(root, sum_cnt, 0)
        
        ans = []
        for nums, cnt in sum_cnt:
            print(nums, cnt, (float(nums)/cnt))
            ans.append((float(nums)/cnt))
        return ans
        
        

        

        
        