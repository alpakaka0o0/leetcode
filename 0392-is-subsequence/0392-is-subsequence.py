class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        idx = 0
        if(len(s) == 0):
            return True
        for i in list(t):
            if (s[idx] == i):
                idx += 1
            if idx == len(s):
                return True

        return False
        