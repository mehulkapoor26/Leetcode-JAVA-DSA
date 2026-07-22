class Solution {
    public int subtractProductAndSum(int n) {
        int d;
       int sum=0;
       int product=1;
       while(n>0){
        d=n%10;
        sum+=d;
        product*=d;
        n/=10;
       }
       return product - sum;
    }
}