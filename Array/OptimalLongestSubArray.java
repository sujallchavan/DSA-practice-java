package Array;

import java.util.HashMap;
import java.util.Map;

public class OptimalLongestSubArray {
    public int OptimalLongestSubArray1(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int cnt = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 1, 1 };

        OptimalLongestSubArray ob = new OptimalLongestSubArray();

        int num = ob.OptimalLongestSubArray1(arr, 1);

        System.out.println(num);

    }
}
