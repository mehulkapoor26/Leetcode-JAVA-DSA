class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum = nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int b = i+1;
            int c = nums.length-1;
            while (b<c){
                int currentsum = a + nums[b] + nums[c];
                if(Math.abs(target-currentsum)<Math.abs(target-closestsum)){
                    closestsum=currentsum;
                }
                if(currentsum<target){
                    b++;
                }else if (currentsum>target){
                    c--;
                }else{
                    return currentsum;
                }
            }
        }
        return closestsum;
    }
}