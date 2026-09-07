class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] key = s.toCharArray();
            Arrays.sort(key);
            String sortedKey = new String(key);
            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }
            map.get(sortedKey).add(s);
        }
        for(String key : map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}