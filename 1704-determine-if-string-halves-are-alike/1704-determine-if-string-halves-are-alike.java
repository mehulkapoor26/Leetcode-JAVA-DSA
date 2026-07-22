class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int mid = s.length() / 2;
        String a = s.substring(0,mid);
        String b = s.substring(mid);
        int v1=0;
        int v2=0;
        for(int i =0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
                v1++;
            }else{continue;}
        }
        for(int j =0;j<b.length();j++){
            char ch = b.charAt(j);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
                v2++;
            }else{continue;}
        }
        if(v1==v2){
            return true;
        }else{
            return false;
        }
    }
}