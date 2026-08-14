class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i=0;
        int j=ch.length - 1;
        String vowels = "aeiouAEIOU";
        while(i<j){
            if(vowels.indexOf(ch[i])==-1){
                i++;
            }else if(vowels.indexOf(ch[j])==-1){
                j--;
            }else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}