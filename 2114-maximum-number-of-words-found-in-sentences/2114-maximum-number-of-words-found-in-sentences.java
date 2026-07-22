class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int max = 0;
        for(String i : sentences){
            String[] words = i.split(" ");
            if(words.length>max){
                max=words.length;
            }
        }
        return max;
    }
}