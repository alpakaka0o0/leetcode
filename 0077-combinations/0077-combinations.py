class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        ans = []
        combi = []
        def dfs(next_k, j, combi, n, ans):
            if next_k == 0:
                ans.append(copy.deepcopy(combi))
                return ans
            for i in range(j, n+1):
                if i not in combi:
                    combi.append(i)
                    dfs(next_k-1, i+1, combi, n, ans)
                    combi.pop()

            return ans
        return dfs(k, 1, combi, n, ans)