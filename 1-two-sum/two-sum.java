class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map seen = new HashMap();
       for (int i = 0; i < nums.length; i++) {
        if (seen.containsKey(target - nums[i])) {
            return new int[] {i, (int)seen.get(target - nums[i])};
        }
        else {
            seen.put(nums[i], i);
        }
       }
       return new int[] {0, 0};
    }
}