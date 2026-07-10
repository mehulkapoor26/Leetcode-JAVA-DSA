/*
Given an array nums of integers, return how many of them contain an even number of digits.
*/

import java.util.Scanner;

public class Q1295_FindNumberswithEvenNumberofDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.FindNumbers(nums); 
        System.out.println("Array = " + result);
        input.close();   
    }
}
class Solution{
    public int FindNumbers(int[] nums){
       
        int count=0;
        
        for(int i=0;i<nums.length;i++){
             int d;
             int digits=0;
            while(nums[i]!=0){
                d=nums[i]%10;
                nums[i]/=10;
                digits++;
            }
            if(digits%2==0){
            count++;
        }else{
            continue;
        }
        }
        
        return count;
    }
}