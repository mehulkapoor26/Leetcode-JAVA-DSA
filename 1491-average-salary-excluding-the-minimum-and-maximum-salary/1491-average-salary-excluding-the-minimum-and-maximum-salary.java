class Solution {
    public double average(int[] salary) {
int min=salary[0];
        int max=salary[0];
        int sum=0;
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
             if(salary[i]>max){
            max=salary[i];
        }
        if(salary[i]<min){
            min=salary[i];
        }
    }
        int count= salary.length - 2;
        int total=sum-max-min;
        double avg = (double) total/count;
        return (double)avg; 
    }
}