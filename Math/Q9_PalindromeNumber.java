import java.util.Scanner;

public class Q9_PalindromeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Solution solution = new Solution();
        boolean result = solution.isPalindrome(n);
        System.out.println(result);
        input.close();
    }
}
class Solution{
    public boolean isPalindrome(int n){
        int d;
        int rev=0;
        int temp=n;
        while(temp>0){
            d=temp%10;
            rev=rev*10 + d;
            temp/=10;
        }
        if(rev==n){
            return true;
        }
        else{
            return false;
        }
    }
}