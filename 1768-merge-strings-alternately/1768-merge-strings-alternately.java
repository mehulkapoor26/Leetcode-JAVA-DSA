class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(word1.length()>i || word2.length()>j){
            if(i<word1.length())sb.append(word1.charAt(i++));
            if(j<word2.length())sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}