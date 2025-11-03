package Array;

public class linearSearch {
    public int linearSearch1(int[] arr, int num) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int num = 2;

        linearSearch ob = new linearSearch();

        int i = ob.linearSearch1(arr, num);

        System.out.println(i);
    }
}
