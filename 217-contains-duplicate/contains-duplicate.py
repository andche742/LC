class Solution(object):
    def containsDuplicate(self, nums):
        blahblah = set()
        for num in nums:
            if num in blahblah:
                return True
            else: 
                blahblah.add(num)
        return False
            
            
            
        """
        :type nums: List[int]
        :rtype: bool
        """
        