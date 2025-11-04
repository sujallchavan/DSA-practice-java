package Array;

public class Kadanes {
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        Kadanes ob = new Kadanes();

        int n = ob.maxSubArray(arr);

        System.out.println(n);
    }
}
