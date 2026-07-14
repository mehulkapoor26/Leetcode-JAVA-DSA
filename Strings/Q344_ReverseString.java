import java.util.Scanner;

public class Q344_ReverseString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] s = str.toCharArray();
        Solution solution = new Solution();
        char[] result = solution.reverseString(s);
        System.out.println(result);
        input.close();
    }
}
class Solution{
    public char[] reverseString(char[] s){
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        return s;
    }
}