package Array;

// Find minimum in Rotated Sorted Array

public class findMin {
    public int findmin1(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            final int m = (l + r) / 2;

            if (arr[m] > arr[r]) {
                l = m + 1;

            } else {
                r = m;
            }

        }

        return arr[r];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7 };

        findMin ob = new findMin();

        int n = ob.findmin1(arr);

        System.out.println(n);
    }
}
