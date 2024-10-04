class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> letters = new HashMap();

        for (char x : s.toCharArray()) {
            letters.put(x, letters.getOrDefault(x, 0) + 1);
        }

        for (char x : t.toCharArray()) {
            letters.put(x, letters.getOrDefault(x, 0) - 1);
        }

        for (int val : letters.values()) {
            if (val != 0) {
                return false;
            }
        }    

        return true;
    }
}