package Array;

public class maxSubArrayB {
    public int maxSubArray1(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        maxSubArrayB ob = new maxSubArrayB();

        int n = ob.maxSubArray1(arr);

        System.out.println(n);

    }

}
