class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // sort string 1
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {           // for loop parse through each instance of s2 length s1
            System.out.println(i);
            char[] tempArray = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(tempArray);
            String temp = new String(tempArray);
            if (sorted.equals(temp)) {         // if all letters match, return true

                return true;
            }
        }
        return false;        // if nothing return false


    }
}