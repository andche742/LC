class Solution(object):
    def twoSum(self, nums, target):
        seenNum = {}
        for i in range(len(nums)):
            if target - nums[i] in seenNum:
                return [seenNum[target - nums[i]], i]
            seenNum[nums[i]] = i
            # put item in map in format number: index in nums
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        