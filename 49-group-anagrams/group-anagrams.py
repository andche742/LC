class Solution(object):
    def groupAnagrams(self, strs):
        anagramMap = defaultdict(list) # create map, if key not found, create empty array 

        for word in strs:
            sortedWord = ''.join(sorted(word)) # create sorted string of letters
            anagramMap[sortedWord].append(word) # add word to map, if not found, creates new key, if found, adds to existing
        
        return list(anagramMap.values()) # return list of values
        