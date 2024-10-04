class Solution(object):
    def isAnagram(self, s, t):
        sSorted = sorted(s)
        tSorted = sorted(t)
        if sSorted == tSorted:
            return True
        else:
            return False
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        