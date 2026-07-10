/*
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
*/

import java.util.Scanner;

public class Q1572_MatrixDiagonalSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] nums = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                nums[i][j]=input.nextInt();
            }
        }
        Solution solution = new Solution();
        int result = solution.DiagonalSum(nums);
        System.out.println("Sum = " + result);
        input.close();
    }
}
class Solution{
    public int DiagonalSum(int[][] nums){
        int d1 = 0;
        int d2 = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==j){
                d1+=nums[i][i];
            }
                int n = nums[j].length;
                if(j==n-1-i){
                d2+=nums[i][n-1-i];
            }
            }
        }
        int n = nums[0].length;
        

        int mid=n/2;
        int midsum=nums[mid][mid];

        int total= d1 + d2 - midsum;
        return total;


    }
}