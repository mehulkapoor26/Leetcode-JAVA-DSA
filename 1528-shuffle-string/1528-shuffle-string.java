class Solution {
    public String restoreString(String s, int[] indices) {
        char[] words = new char[s.length()];
        for(int i=0;i<s.length();i++){
            words[indices[i]]=s.charAt(i);
        }
        return new String(words);
    }
}