package Array;

public class LeftRotateD {
    public void LeftRotate1places(int arr[]) {
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        LeftRotateD ob = new LeftRotateD();

        ob.LeftRotate1places(arr);
    }

}
