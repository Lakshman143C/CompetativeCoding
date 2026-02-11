package org.laxman.striver.heaps.problems;

import java.util.*;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        int[] nums={4,1,-1,2,-1,2,3};
        int[] res = topKFrequent(nums, 2);
        System.out.println(Arrays.toString(res));
    }

    static public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int n : map.keySet()) {
            pq.add(n);
            if (pq.size() > k)
                pq.poll();
        }
        int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.poll();
        }
        return res;
    }
}
