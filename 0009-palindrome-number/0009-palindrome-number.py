class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        str_x = str(x)
        reverse_x = "".join(reversed(list(str_x)))
        print(reverse_x)
        if reverse_x != str_x:
            return False
        return True
        