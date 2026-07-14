/*

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

*/

import java.util.Scanner;

public class Q136_SingleNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.singleNumber(nums);
        System.out.println(result);
        input.close();
    }
}
class Solution{
    public int singleNumber(int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }
}