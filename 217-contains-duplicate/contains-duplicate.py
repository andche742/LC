class Solution(object):
    def containsDuplicate(self, nums):
        aset = set() # use set because looking for unique numbers
        for n in nums: 
            if n in aset: # if we've already seen number, return true, if not, add it
                return True
            aset.add(n)
        return False
            
            
            
        """
        :type nums: List[int]
        :rtype: bool
        """
        