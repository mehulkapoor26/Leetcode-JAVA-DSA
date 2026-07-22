class Solution {
    public int findNumbers(int[] nums) {
int sum=0;
        for(int i=0;i<nums.length;i++){
            int d;
            int count=0;
            while(nums[i]!=0){
                d=nums[i]%10;
                nums[i]/=10;
                count++;
            }
            if(count%2==0){
                sum++;
            }else{
                continue;
            }
        }
        return sum;
    }
}