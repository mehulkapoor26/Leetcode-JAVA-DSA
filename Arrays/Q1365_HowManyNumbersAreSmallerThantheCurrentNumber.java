/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Q1365_HowManyNumbersAreSmallerThantheCurrentNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.smallerNumbersThanCurrent(nums); 
        System.out.println("Array = " + Arrays.toString(result));
        input.close();   
    }
}
class Solution{
    public int[] smallerNumbersThanCurrent(int[] nums){
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]+=count;
        }
        return ans;
    }
}