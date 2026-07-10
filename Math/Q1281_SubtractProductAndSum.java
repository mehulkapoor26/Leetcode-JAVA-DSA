import java.util.Scanner;

public class Q1281_SubtractProductAndSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = input.nextInt();
        Solution solution = new Solution();
        int result = solution.subtractProductAndSum(n);
        System.out.println("Product - Sum = " + result);
        input.close();
    }
}
class Solution{
    public int subtractProductAndSum(int n){
        int d;
        int sum = 0;
        int product = 1;
        while(n!=0){
            d = n%10;
            sum+=d;
            product*=d;
            n/=10;
        }
        return product - sum;
    }
}