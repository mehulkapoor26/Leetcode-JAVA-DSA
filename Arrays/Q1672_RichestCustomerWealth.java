/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/

import java.util.Scanner;

public class Q1672_RichestCustomerWealth{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] nums = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j]=input.nextInt();
            }
        }
        Solution solution = new Solution();
        int result = solution.maximumWealth(nums);
        System.out.println("max = " + result);
        input.close();
    }
}
class Solution{
    public int maximumWealth(int[][] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums[i].length;j++){
                sum+=nums[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

}