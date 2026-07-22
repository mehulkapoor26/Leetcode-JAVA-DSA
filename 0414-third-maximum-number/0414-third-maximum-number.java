class Solution {
    public int thirdMax(int[] nums) {
        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;
        for(int i : nums){
            if(i==m1 || i==m2 || i==m3){
                continue;
            }
            if(i>m1){
                m3=m2;
                m2=m1;
                m1=i;
            }
            else if(i>m2){
                m3=m2;
                m2=i;
            }
            else if(i>m3){
                m3=i;
            }
        }
        if(m3!=Long.MIN_VALUE){
            return (int) m3;
        }else{
            return (int) m1;
        }
    }
}