package Array;

public class sortColors {
    public void sortColorsO(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1; // ✅ Fix: last valid index

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--; // ✅ Fix: decrease instead of increase
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 0, 0, 2 };

        sortColors ob = new sortColors();
        ob.sortColorsO(arr);

        for (int a : arr) {
            System.out.println(a);
        }
    }

}
