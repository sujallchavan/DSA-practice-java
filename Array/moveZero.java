package Array;

public class moveZero {
    public void moveZero1(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0, 4, 0, 0, 5 };

        moveZero ob = new moveZero();

        ob.moveZero1(arr);

        for (int a : arr) {
            System.out.println(a);
        }

    }
}
