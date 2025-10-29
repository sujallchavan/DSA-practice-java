package sorting;

public class selectionSort {

    public void selectionSort1(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minInx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minInx]) {
                    minInx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minInx];
            arr[minInx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 2 };
        selectionSort ob = new selectionSort();
        ob.selectionSort1(arr);

        for (int a : arr) {
            System.out.println(a);
        }
    }

}
