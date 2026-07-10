/*
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q867_TransposeMatrix{
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
        int[][] result = solution.transpose(nums);
        System.out.println("Array = " + Arrays.deepToString(result));
        input.close();
    }
}
class Solution{
    public int[][] transpose(int[][] nums){
        int m=nums.length;
        int n=nums[0].length;
        int[][] ans = new int[n][m];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                ans[j][i] = nums[i][j];
            }
        }
        return ans;
    }
}