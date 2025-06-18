class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        candidates.sort()
        ans = []
        q= collections.deque()
        n = len(candidates)
        for i in range(n):
            candidate = candidates[i]
            if candidate < target:
                q.append(([candidate], i)) # (arrays, idx)
            if candidate == target:
                ans.append([candidate])
        while q:
            combi, cur_idx = q.popleft()
            sum_combi = sum(combi)
            for i in range(cur_idx, n):
                if sum_combi + candidates[i] < target:
                    q.append((combi + [candidates[i]], i))
                elif sum_combi + candidates[i] == target:
                    ans.append(combi + [candidates[i]])
                else:
                    break
            

        return ans