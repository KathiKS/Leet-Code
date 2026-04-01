class Solution {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i += 1) {
            if (cache.containsKey(target - nums[i])) {
                final int j = cache.get(target - nums[i]);
                return new int[]{i, cache.get(target - nums[i])};
            }
            cache.put(nums[i], i);
        }

        return new int[0];
    }
}