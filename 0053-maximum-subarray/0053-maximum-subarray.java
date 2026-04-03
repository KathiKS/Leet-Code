class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int total=0;
        for(int num:nums){
            if(total<0){
                total=0;
            }
            total+=num;
            res=Math.max(res,total);
        }
        return res;
    }
}