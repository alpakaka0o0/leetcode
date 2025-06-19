class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        self.ans = [] 
        self.dfs("", 0, 0, n)
        return self.ans


    def dfs(self, genText, open, close, n):
        if open == close and len(genText) == (n*2):
            self.ans.append(genText)
            return
        if open < n:
            newText = genText + "("
            self.dfs(newText, open + 1, close, n)
        if open > close:
            newText = genText + ")"
            self.dfs(newText, open, close+1, n)

