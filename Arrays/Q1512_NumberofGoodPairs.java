/*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/

import java.util.Scanner;

public class Q1512_NumberofGoodPairs{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.numIdenticalPairs(nums);
        System.out.println("output = " + result);
        input.close();
    }
}
class Solution{
    public int numIdenticalPairs(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}