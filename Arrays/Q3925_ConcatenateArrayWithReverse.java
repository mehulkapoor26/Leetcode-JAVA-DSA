/*
You are given an integer array nums of length n.
Construct a new array ans of length 2 * n such that the first n elements are the same as nums,
and the next n elements are the elements of nums in reverse order.
Formally, for 0 <= i <= n - 1:

ans[i] = nums[i]
ans[i + n] = nums[n - i - 1]
Return an integer array ans.

*/

import java.util.Arrays;
import java.util.Scanner;
public class Q3925_ConcatenateArrayWithReverse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        Solution solution  = new Solution();
        int[] result = solution.concatWithReverse(nums);
        System.out.println("Array = " + Arrays.toString(result));
        input.close();
    }
}
class Solution{
    public int[] concatWithReverse(int[] nums){
       int n=nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j<n;j++){
                ans[i] = nums[i];
                ans[i+n] = nums[n-i-1];
            }
        }
        return ans;
    }
}