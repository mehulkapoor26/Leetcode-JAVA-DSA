/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of
candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1431_KidsWiththeGreatestNumberofCandies{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] candies = new int[n];
        for(int i=0;i<candies.length;i++){
            candies[i]=input.nextInt();
        }
        int extraCandies = input.nextInt();
        Solution solution = new Solution();  
        List<Boolean> result = solution.kidsWithCandies(candies,extraCandies);
        System.out.println("Arrays = " + result);
        input.close(); 
    }
}
class Solution{
    public List<Boolean> kidsWithCandies(int[] candies , int extraCandies){
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}