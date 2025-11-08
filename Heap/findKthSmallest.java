package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class findKthSmallest {
    public int findKthSmallest1(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.offer(num);
        }

        while (pq.size() > k) {
            pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 18, 22, 52, 42, 500 };

        findKthSmallest ob = new findKthSmallest();

        int small = ob.findKthSmallest1(arr, 3);

        System.out.println(small);
    }

}
