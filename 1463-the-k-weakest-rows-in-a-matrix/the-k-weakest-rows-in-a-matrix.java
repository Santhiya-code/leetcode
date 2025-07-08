class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            int count = 0; // ✅ Start count at 0
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            map.put(i, count); // ✅ Always store soldier count (even if 0)
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (i, j) -> map.get(i).equals(map.get(j)) ? i - j : map.get(i) - map.get(j)
        );

        for (int num : map.keySet()) {
            pq.add(num);
        }

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = pq.poll();
        }

        return arr;
    }
}
