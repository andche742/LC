
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        
        // Add all numbers to the HashSet for fast lookup
        for (int num : nums) {
            numbers.add(num);
        }
        
        int max = 0;
        
        // Iterate over all numbers
        for (Integer num : numbers) {
            // Only start counting if `num - 1` is not in the set, meaning `num` is the start of a sequence
            if (!numbers.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;
                
                // Count consecutive numbers
                while (numbers.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }
                
                // Update max streak if the current one is longer
                max = Math.max(max, streak);
            }
        }
        
        return max;
    }
}