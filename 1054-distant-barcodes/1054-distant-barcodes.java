import java.util.*;

class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int b : barcodes) {
            freq.put(b, freq.getOrDefault(b, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );

        for (int key : freq.keySet()) {
            pq.add(new int[]{key, freq.get(key)});
        }

        int index = 0;
        int[] result = new int[barcodes.length];

        while (pq.size() >= 2) {
            int[] first = pq.poll();
            int[] second = pq.poll();

            result[index++] = first[0];
            result[index++] = second[0];

            if (--first[1] > 0) pq.add(first);
            if (--second[1] > 0) pq.add(second);
        }

        if (!pq.isEmpty()) {
            result[index] = pq.poll()[0];
        }

        return result;
    }
}
