/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/


import java.util.Arrays;
import java.util.Scanner;

public class Q1470_ShuffletheArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[2*n];
        for(int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
        }
        Solution solution = new Solution();  
        int[] result = solution.shuffle(nums,n);
        System.out.println("Arrays = " + Arrays.toString(result));
        input.close(); 
    }
}
class Solution{
    public int[] shuffle(int[] nums,int n){
        int ansIndex=0;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[ansIndex]=nums[i];
            ansIndex++;
            ans[ansIndex]=nums[i+n];
            ansIndex++;
        }
        return ans;
    }
}