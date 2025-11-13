package Array;

import java.util.HashMap;
import java.util.Map;

public class singleNonDuplicate {
    public int singleNonDuplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };

        singleNonDuplicate ob = new singleNonDuplicate();

        int n = ob.singleNonDuplicate(arr);

        System.out.println(n);
    }
}
