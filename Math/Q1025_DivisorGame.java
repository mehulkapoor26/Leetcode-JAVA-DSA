/*
Alice and Bob take turns playing a game, with Alice starting first.

Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:

Choosing any integer x with 0 < x < n and n % x == 0.
Replacing the number n on the chalkboard with n - x.
Also, if a player cannot make a move, they lose the game.

Return true if and only if Alice wins the game, assuming both players play optimally.

*/

import java.util.Scanner;

public class Q1025_DivisorGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Solution solution = new Solution();
        boolean result = solution.divisorGame(n);
        System.out.println(result);
        input.close();
    }
}
class Solution{
    public boolean divisorGame(int n){
        if(n%2==0){
        return true;
        }
        else{
        return false;
        }
    }
}