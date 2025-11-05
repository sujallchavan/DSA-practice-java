package Array;

import java.lang.reflect.Array;

import java.util.Arrays;

public class longestConsecutive {
    public int longestCon(int[] arr) {

        int n = arr.length;

        if (n == 0)
            return 0;

        int cnt = 1;
        int maxC = Integer.MIN_VALUE;

        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == arr[i - 1] + 1) {
                    cnt++;
                } else {
                    maxC = Math.max(maxC, cnt);
                    cnt = 0;
                }
            }
        }

        return Math.max(maxC, cnt);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5 };

        longestConsecutive ob = new longestConsecutive();

        int n = ob.longestCon(arr);

        System.out.println(n);
    }

}
