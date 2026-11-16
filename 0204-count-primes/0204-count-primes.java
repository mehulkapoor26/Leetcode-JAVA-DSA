class Solution {
    public int countPrimes(int n) {
        boolean[] p = new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(!p[i] && ++count>0){
                for(long j=(long) i*i;j<n;j+=i){
                    p[(int)j] = true;
                }
            }
        }
        return count;
    }
}