class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer , Integer> map = new HashMap<>();
        for(int e : nums){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }else{
                map.put(e,1);
            }
        }
        for(Integer e : map.keySet()){
            if(map.get(e)>n/2){
                return e;
            }
        }
    return -1;






// int num=0;
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(count==0){
//                 num=nums[i];
//             } 
//             if(nums[i]==num){
//             count++;
//         }else{
//             count--;
//         }
//         }
       
//         return num;




    }
}