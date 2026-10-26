class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); 
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            int a = nums[i];
            int b = i+1;
            int c = n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(b<c){
                int sum = a+nums[b]+nums[c];
                if(sum<0){
                    b++;
                }else if (sum>0){
                    c--;
                }else if(sum==0){

                    while(b<c && nums[b]==nums[b+1]) b++;
                    while(b<c && nums[c]==nums[c-1]) c--;
                    ans.add(Arrays.asList(a,nums[b],nums[c]));
                    b++;
                    c--;
                }
            }
        }
        return ans;
    }
}