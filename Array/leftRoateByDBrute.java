package Array;

public class leftRoateByDBrute {
    public void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

    }

    public static void main(String[] args) {
        int d = 3;
        int[] arr = { 1, 2, 3, 4, 5 };

        leftRoateByDBrute ob = new leftRoateByDBrute();

        ob.leftRotate(arr, d);

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
