class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        x_lst = list(str(x))
        result = ""
        for i in reversed(x_lst):
            if(i == "-"):
                result = "-"+result
                continue
            if(i == "0" and result == "" and len(x_lst) != 1):
                continue
            result += i
        print(result)
        result_int = int(result)
        if(result_int < ((-1) * ((2) ** 31)) 
            or result_int > ((2 ** 31)- 1)):
            result_int = 0
        return result_int
        
        