class Solution {
    public String reverseWords(String s) {
      String[] words = s.split(" ");
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<words.length;i++){
        String rev = new StringBuilder(words[i]).reverse().toString();
        sb.append(rev);
        if(i<words.length-1){
            sb.append(" ");
        }
      }
      return sb.toString();
    }
}