class Solution(object):
    def productExceptSelf(self, nums):
        output = [None]*len(nums) # intialize empty array
        output[0] = 1
        for i in range(1, len(nums)):
            output[i] = output[i - 1] * nums[i - 1]
        right = 1
        for j in range(len(nums)-1, -1, -1):
            output[j] = output[j] * right
            right = right * nums[j]
        return output


        """
        :type nums: List[int]
        :rtype: List[int]
        """
        