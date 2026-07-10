/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
*/

import java.util.Scanner;
public class Q125_ValidPalindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        Solution solution = new Solution();
        Boolean result = solution.isPalindrome(s);
        System.out.println(result);
        input.close();
    }
}
class Solution{
    public Boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=0;i<s.length() /2 ;i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}