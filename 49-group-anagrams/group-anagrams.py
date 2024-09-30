class Solution(object):
    def groupAnagrams(self, strs):
        anagramMap = defaultdict(list)

        for word in strs:
            sortedWord = ''.join(sorted(word))
            anagramMap[sortedWord].append(word)
        
        return list(anagramMap.values())
        