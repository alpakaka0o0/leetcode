class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        if len(nums) == 1:
            return float(nums[0])
        start = 0
        end = k
        average = 0.0

        for i in range(k):
            average += float(nums[i]) / k

        max_average = average

        while end < len(nums):
            average = average - float(nums[start]) / k
            average = average + float(nums[end]) / k
            max_average = max(max_average, average)
            start += 1
            end += 1
        
        return max_average