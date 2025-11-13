package Array;

import java.util.HashMap;
import java.util.Map;

// Count occurrences of a number in a sorted array with duplicates

public class firstOccurrence {
    public int firstOccurrence1(int[] arr, int x) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == x) {
                return entry.getValue();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int x = 8;

        firstOccurrence ob = new firstOccurrence();

        int n = ob.firstOccurrence1(arr, x);

        System.out.println(n);

    }
}
