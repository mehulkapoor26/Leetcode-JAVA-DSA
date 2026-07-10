/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, 
starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

*/

import java.util.Scanner;

public class Q509_FibonacciNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Solution solution = new Solution();
        int result = solution.fib(n);
        System.out.println(result);
        input.close();
    }
}
class Solution{
    public int fib(int n){
        if(n==0){
        return 0;
        }
        if(n==1){
        return 1;
        }
        int a=0;
        int b=1;
        int c;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}