class Solution(object):
    def containsDuplicate(self, nums):
        aset = set()
        for n in nums:
            if n in aset:
                return True
            aset.add(n)
        return False
            
            
            
        """
        :type nums: List[int]
        :rtype: bool
        """
        