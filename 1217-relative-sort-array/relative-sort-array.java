import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> order = new ArrayList<>();
        ArrayList<Integer> remaining = new ArrayList<>();

        // Convert arr1 to list
        for (int num : arr1) {
            arr.add(num);
        }

        // Count frequency of each number in arr1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 1: Add numbers that are in arr2 (in arr2's order)
        for (int num : arr2) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                for (int i = 0; i < count; i++) {
                    order.add(num);
                }
                map.remove(num);
            }
        }

        // Step 2: Add remaining numbers (not in arr2), sorted
        ArrayList<Integer> rest = new ArrayList<>(map.keySet());
        Collections.sort(rest);
        for (int num : rest) {
            int count = map.get(num);
            for (int i = 0; i < count; i++) {
                remaining.add(num);
            }
        }

        // Combine both lists
        order.addAll(remaining);

        // Convert to int[]
        int[] res = new int[order.size()];
        for (int i = 0; i < order.size(); i++) {
            res[i] = order.get(i);
        }

        return res;
    }
}
