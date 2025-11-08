package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class findKthLargest {
    public int findKthLargest1(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.offer(num);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        findKthLargest ob = new findKthLargest();

        int l = ob.findKthLargest1(arr, 3);

        System.out.println(l);
    }

}
