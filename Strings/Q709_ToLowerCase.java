import java.util.Scanner;

public class Q709_ToLowerCase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Solution solution = new Solution();
        String result = solution.toLowerCase(s);
        System.out.println("Lowered String = " + result);
        input.close();
    }
}
class Solution{
    public String toLowerCase(String s){
        return s.toLowerCase();
    }
}