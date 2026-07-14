/*

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

*/

import java.util.Arrays;
import java.util.Scanner;

public class Q242_ValidAnagram{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t = input.nextLine();
        Solution solution = new Solution();
        Boolean result = solution.isAnagram(s,t);
        System.out.println(result);
        input.close();
    }
}
class Solution{
    public Boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr,tarr);
    }
}