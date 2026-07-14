import java.util.Scanner;

public class Q169_MajorityElement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.majorityElement(nums);
        System.out.println(result);
        input.close();
    }
}
class Solution{
    public int majorityElement(int[] nums){
        int a=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(a==0){
                a=nums[i];
            }
            if(a==nums[i]){
                count++;
            }else{
                count--;
            }
            
        }
        return a;
        
    }
}