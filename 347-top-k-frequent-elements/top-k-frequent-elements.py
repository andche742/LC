from collections import Counter # funny tool
class Solution(object):
    def topKFrequent(self, nums, k):
        counter = Counter(nums) # returns dict {number: number of that number}
        return  sorted(counter, key=counter.get, reverse=True)[:k] # return keys with top values

        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        