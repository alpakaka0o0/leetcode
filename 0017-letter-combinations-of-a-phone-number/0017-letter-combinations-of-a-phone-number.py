class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        letters = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]
        ans = []
        if digits == "":
            return ans
        def dfs(idx, text, letters, digits, ans):
            if idx == len(digits):
                ans.append(text)
                return ans
            for letter in list(letters[int(digits[idx])]):
                next_text = text + letter
                dfs(idx+1, next_text, letters, digits, ans)
                
            return ans

        return dfs(0, "", letters, digits, ans)