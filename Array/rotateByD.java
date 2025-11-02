package Array;

public class rotateByD {

    public void revers(int[] arr, int start, int end) {

        if (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public void rotate(int[] arr, int n, int k) {
        revers(arr, 0, k - 1);
        revers(arr, k, n - 1);
        revers(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 6 };
        int n = arr.length;
        int k = 3;

        rotateByD ob = new rotateByD();

        ob.rotate(arr, n, k);

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
