import java.util.Scanner;

public class Q7_ReverseInteger{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Solution solution = new Solution();  
        int result = solution.Reverse(n);
        System.out.println("Reverse : " + result);
        input.close();
    }   
}
class Solution{
    public int Reverse(int n){
        int d;
        int rev=0;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        return rev;
    }
}