/*

Given the array of integers nums, you will choose two different indices i and j of that array.
Return the maximum value of (nums[i]-1)*(nums[j]-1).

*/

import java.util.Scanner;
public class Q1464_MaximumProductofTwoElementsinanArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        Solution solution  = new Solution();
        int result = solution.maxProduct(nums);
        System.out.println("Array = " + result);
        input.close();
    }
}
class Solution{
    public int maxProduct(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product =0;
                product = (nums[i]-1)*(nums[j]-1);
                if(product>max){
                max=product;
                }
            }   
        }
        return max;
    }
}