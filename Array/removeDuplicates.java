package Array;

public class removeDuplicates {
    public int removeDuplicates1(int[] arr) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 4, 2, 2, 4, 5, 6 };

        removeDuplicates ob = new removeDuplicates();

        int cnt = ob.removeDuplicates1(arr);

        System.out.println(cnt);
    }

}
