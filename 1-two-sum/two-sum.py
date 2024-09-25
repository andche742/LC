class Solution(object):
    def twoSum(self, nums, target):
        seenNum = {}
        for i in range(len(nums)):
            if target - nums[i] in seenNum:
                return [seenNum[target - nums[i]], i]
            seenNum[nums[i]] = i
        return []
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        