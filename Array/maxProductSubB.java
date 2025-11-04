package Array;

public class maxProductSubB {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int maxP = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int product = 0;
            for (int j = i; j < n; j++) {
                product *= arr[j];
                maxP = Math.max(product, maxP);
            }
        }

        return maxP;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };

        maxProductSubB ob = new maxProductSubB();

        int n = ob.maxProduct(arr);

        System.out.println(n);
    }
}
