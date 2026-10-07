class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int e:nums) freqMap.put(e, freqMap.getOrDefault(e,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet())maxHeap.add(entry);
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> entry = maxHeap.poll();
            ans[i] = entry.getKey();
        }
        return ans;
    }
}