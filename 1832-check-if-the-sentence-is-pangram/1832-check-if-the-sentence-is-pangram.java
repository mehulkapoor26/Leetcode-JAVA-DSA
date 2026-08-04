class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)!=-1){
                count++;
            }
        }
        return count==26;
    }
}