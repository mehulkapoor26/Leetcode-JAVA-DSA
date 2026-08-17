class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int subSum=nums[0];
        for(int i=1;i<n;i++){
            subSum= Math.max(subSum + nums[i], nums[i]);
            max=Math.max(max,subSum);
        }
        return max;
    }
}