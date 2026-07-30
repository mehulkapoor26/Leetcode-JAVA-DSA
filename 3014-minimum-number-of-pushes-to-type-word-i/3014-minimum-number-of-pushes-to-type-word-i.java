class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int count=0;
        if(n>0) count+=Math.min(n,8)*1;
        if(n>8) count+=Math.min(n-8,8)*2;
        if(n>16) count+=Math.min(n-16,8)*3;
        if(n>24) count+=Math.min(n-24,8)*4;
        return count;
    }
}