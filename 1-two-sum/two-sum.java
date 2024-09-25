class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        // map to remember numbers we've seen 
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            // nums[i] + complement = target gives us sollution
            if (intMap.containsKey(complement)) {
                return new int[]{intMap.get(target - nums[i]), i};
            }
            // if complement in map, return solution
            intMap.put(nums[i], i);
            // if not, put number into map to remember
        }
        return new int[]{0 , 0};
        // return 0, 0 if no answer
    }
}