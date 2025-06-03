class Solution(object):
    def minMutation(self, startGene, endGene, bank):
        """
        :type startGene: str
        :type endGene: str
        :type bank: List[str]
        :rtype: int
        """

        s = set(bank)
        if endGene not in s and startGene != endGene:
            return -1

        q = collections.deque([(startGene, 0)])

        v = {startGene}

        while q:
            g, d = q.popleft()
            if g == endGene:
                return d

            for i in range(8):
                for c in 'ACGT':
                    if g[i] != c:
                        n = g[:i] + c + g[i+1:]
                        if n in s and n not in v:
                            v.add(n)
                            q.append((n, d+1))
        return -1
        