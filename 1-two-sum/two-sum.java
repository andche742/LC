class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map seen = new HashMap();
       int complement;
       int index = 0;
       for (int num : nums) {
        complement = target - num;
        if (seen.containsKey(complement)) {
            return new int[] {index, (int)seen.get(complement)};
        }
        else {
            seen.put(num, index);
        }
        index++;
       }
       return new int[] {0, 0};
    }
}