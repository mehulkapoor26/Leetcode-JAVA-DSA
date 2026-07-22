class Solution {
    public int[] shuffle(int[] nums, int n) {
int[] ans = new int[2*n];
        int ansIndex=0;
        for(int i=0;i<n;i++){
            ans[ansIndex]=nums[i];
            ansIndex++;

            ans[ansIndex]=nums[i+n];
            ansIndex++;
        }
        return ans;
    }
}