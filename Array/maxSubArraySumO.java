package Array;

public class maxSubArraySumO {
    public int maxSubArray(int[] arr) {
        int n = arr.length;

        int curr = arr[0];
        int glob = arr[0];

        for (int i = 1; i < n; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            glob = Math.max(curr, glob);
        }

        return glob;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        maxSubArraySumO ob = new maxSubArraySumO();

        int n = ob.maxSubArray(arr);

        System.out.println(n);
    }
}
