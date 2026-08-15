class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Key = Number needed, Value = Index of current number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If we have seen the complement before, we found the pair
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, save the current number and its index
            map.put(nums[i], i);
        }
        
        return new int[0]; // Return empty array if no pair exists
    }
}