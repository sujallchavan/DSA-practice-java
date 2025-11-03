package Array;

public class getLongestSubarray {
    public int getLongestSubarray1(int[] arr, int k) {
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = i; j < arr.length; j++) {
                s += arr[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 1, 1 };
        int k = 1;

        getLongestSubarray ob = new getLongestSubarray();

        int num = ob.getLongestSubarray1(arr, k);

        System.out.println(num);
    }
}
