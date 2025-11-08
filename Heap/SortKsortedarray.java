package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SortKsortedarray {
    public List<Integer> SortKsortedarray1(List<Integer> arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= k && i < arr.size(); i++) {
            heap.add(arr.get(i));
        }

        for (int i = k + 1; i < arr.size(); i++) {
            result.add(heap.poll());
            heap.add(arr.get(i));
        }

        while (!heap.isEmpty()) {
            result.add(heap.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22, 1, 33, 42, 56, 77);
        int k = 3;

        SortKsortedarray ob = new SortKsortedarray();

        List<Integer> sorted = ob.SortKsortedarray1(list, k);

        for (int a : sorted) {
            System.out.println(a);
        }
    }

}
