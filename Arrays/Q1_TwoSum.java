/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q1_TwoSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        int target = input.nextInt();
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums,target); 
        System.out.println("Array = " + Arrays.toString(result));
        input.close();   
    }
}
class Solution{
    public int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}