package Heap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class replaceWithRank {
    public int[] replaceWithRank1(int[] arr) {
        int n = arr.length;

        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;

        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 2, 70, 2, 50 };

        replaceWithRank ob = new replaceWithRank();
        int[] ans = ob.replaceWithRank1(arr);

        for (int a : ans) {
            System.out.println(a);
        }

    }

}
