class Solution(object):
    def isAnagram(self, s, t):
        if (len(s) != len(t)): # if length if diff obv not anagram
            return False
        
        sDict = {} # dictionary to hold # of each letter
        tDict = {}
        for i in range(len(s)):
            sDict[s[i]] = 1 + sDict.get(s[i], 0) # count = 1 + existing count
            tDict[t[i]] = 1 + tDict.get(t[i], 0)
        return sDict == tDict # return whether they are equal or not
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        