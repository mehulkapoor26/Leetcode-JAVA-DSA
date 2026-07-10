/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q1480_RunningSumof1dArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.runningsum(nums); 
        System.out.println("Array = " + Arrays.toString(result));
        input.close();   
    }
}
class Solution{
    public int[] runningsum(int[] nums){
        
        int[] ans = new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}