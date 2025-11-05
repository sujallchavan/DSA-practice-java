package Array;

public class rearrangeArray {
    public int[] rearrangeArrayB(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int p = 0; // positive index
        int neg = 1; // negative index

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && p < n) {
                ans[p] = arr[i];
                p += 2;
            } else if (arr[i] < 0 && neg < n) {
                ans[neg] = arr[i];
                neg += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 3, -2, -3, 2 };

        rearrangeArray ob = new rearrangeArray();
        int[] ans = ob.rearrangeArrayB(arr);

        for (int a : ans) {
            System.out.println(a);
        }
    }
}
