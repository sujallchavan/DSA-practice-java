package sorting;

public class insertionSort {
    public void insertionSort1(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 3 };

        insertionSort ob = new insertionSort();

        ob.insertionSort1(arr);

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
