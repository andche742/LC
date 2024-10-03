class Solution(object):
    def productExceptSelf(self, nums):
        output = [0]*len(nums)
        output[0] = 1
        for i in range(1, len(nums)):
            output[i] = output[i - 1] * nums[i - 1]
            # [1, 1, 2, 6]
            # [1, 2, 3, 4]
        right = 1
        print("hi")
        for j in range(len(nums)-1, -1, -1):
            output[j] = output[j] * right
            print(output[j])
            right = right * nums[j]
            print(right)
        print("bye")
        return output


        """
        :type nums: List[int]
        :rtype: List[int]
        """
        