class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
              pq.add(stone);
        }
        while(pq.size()>1){
            int fi=pq.poll();
            int la=pq.poll();
            if(fi!=la){
              int k=fi-la;
              pq.add(k);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();

    }
}