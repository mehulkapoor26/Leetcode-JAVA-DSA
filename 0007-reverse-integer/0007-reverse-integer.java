class Solution {
    public int reverse(int x) {
          int d;
        long rev=0;
        //int temp = x;

        while(x!=0){
            d=x%10;
            rev=rev*10 +d;
            x/=10;
        }

        
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        } 
          return (int) rev;
    }
}