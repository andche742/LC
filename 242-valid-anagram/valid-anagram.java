class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap();
        HashMap<Character, Integer> tMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) { // populate sMap
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            }
            else {
                sMap.put(s.charAt(i), 1);
            }
        }

        
        for (int i = 0; i < t.length(); i++) {
            if (tMap.containsKey(t.charAt(i))) { // populate tMap
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
            else {
                tMap.put(t.charAt(i), 1);
            }
        }

        return sMap.equals(tMap);
    }
}