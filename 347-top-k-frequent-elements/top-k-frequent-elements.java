import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        /*List<Integer> sortedList = new ArrayList<>(freqMap.keySet());
        sortedList.sort((a, b) -> freqMap.get(b) - freqMap.get(a)); */
        PriorityQueue<Integer> pq=new PriorityQueue<>((i,j)->(freqMap.get(j) - freqMap.get(i)));
        pq.addAll(freqMap.keySet());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        } 

        return result;
    }
}
