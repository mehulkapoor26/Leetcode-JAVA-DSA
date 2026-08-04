class Solution {
    public String convert(String s, int numRows) {
        String[] nums = new String[numRows];
        for(int i=0;i<numRows;i++){
            nums[i]="";
        }
        int i=0;
        int n=s.length();
        while(i<n){
            // top to bottom
            for(int j=0;j<numRows && i<n;j++){ 
                nums[j]+=s.charAt(i);
                i++;
            }
            // bottom to top
            for(int j=numRows-2;j>0 && i<n;j--){
                nums[j]+=s.charAt(i);
                i++;
            }
        }
        String a= "";
        for(int k=0;k<numRows;k++){
            a+=nums[k];
        }
        return a;
    }
}