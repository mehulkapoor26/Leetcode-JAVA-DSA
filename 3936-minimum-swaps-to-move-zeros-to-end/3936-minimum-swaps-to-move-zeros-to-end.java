class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int zcount=0;
        int ncount=0;

        for(int i : nums){
            if(i==0){
                zcount++;
            }
        }

        ncount= n - zcount;
        int wrong=0;
        for(int i=0;i<ncount;i++){
            if(nums[i]==0){
                wrong++;
            }
        }
        return wrong;
    }
}