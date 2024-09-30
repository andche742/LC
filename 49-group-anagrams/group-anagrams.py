class Solution(object):
    def groupAnagrams(self, strs):
        sorts = []
        groups = []
        for word in strs:
            if (sorted(word) in sorts):
                print(sorted(word + "in sorts"))
                groups[sorts.index(sorted(word))].append(word)
            else:

                groups.append([word])
                sorts.append(sorted(word))
        return groups

        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        