from collections import Counter
class Solution(object):
    def topKFrequent(self, nums, k):
        counter = Counter(nums)
        return  sorted(counter, key=counter.get, reverse=True)[:k]

        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        