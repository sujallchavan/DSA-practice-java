package Array;

public class BproductExceptSelf {
    public int[] productExceptSelf(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {

                if (i != j) {
                    product *= arr[j];
                }

            }

            ans[i] = product;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        BproductExceptSelf ob = new BproductExceptSelf();

        int[] ans = ob.productExceptSelf(arr);

        for (int a : ans) {
            System.out.println(a);
        }
    }
}
