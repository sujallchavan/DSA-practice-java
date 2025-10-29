package sorting;

public class bubleSort {

    public void bubleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 3, 5 };

        bubleSort ob = new bubleSort();
        ob.bubleSort(arr);

        for (int a : arr) {
            System.out.println(a);
        }
    }

}
