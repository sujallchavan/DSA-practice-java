package recusion;

public class reversArray {

    public void reversArray1(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        reversArray1(arr, low + 1, high - 1);
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        reversArray ob = new reversArray();

        ob.reversArray1(arr, 0, arr.length - 1);

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
