class Solution(object):
    def isAnagram(self, s, t):
        if sorted(s) == sorted(t):
            return True
        else:
            return False
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        