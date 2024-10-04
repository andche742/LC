class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sortedLetters = new HashMap();
        for (String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String ordered = new String(ch);

            if (!(sortedLetters.containsKey(ordered))) {
                sortedLetters.put(ordered, new ArrayList());
            }
            sortedLetters.get(ordered).add(word);
        }
        
        return new ArrayList(sortedLetters.values());
    }
}