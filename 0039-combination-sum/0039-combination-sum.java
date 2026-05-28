class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, ans, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] arr,
                          int target,
                          int start,
                          List<List<Integer>> ans,
                          List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > target) break;
            ds.add(arr[i]);
            backtrack(arr, target - arr[i], i, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}