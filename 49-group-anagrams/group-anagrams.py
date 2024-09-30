class Solution(object):
    def groupAnagrams(self, strs):
        sorts = [] # list for sorted words
        groups = [] # output
        for word in strs: # if word is in sorted, its an anagram: add it to group
            if (sorted(word) in sorts):
                groups[sorts.index(sorted(word))].append(word)
            else: # otherwise make new sorts element for it and new group
                groups.append([word])
                sorts.append(sorted(word))
        return groups

        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        