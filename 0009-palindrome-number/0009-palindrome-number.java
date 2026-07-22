class Solution {
    public boolean isPalindrome(int x) {
        int d;
        int rev=0;
        int temp = x;
        while(temp>0){
            d=temp%10;
            rev=rev*10 +d;
            temp/=10;
        }
        if(rev==x){
            return true;
        }else{
            return false;
        } 
    }
}