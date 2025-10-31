package Array;

public class secondSmallest {

    public int secondSmallest1(int[] arr) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        return secondSmall;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 6, 7 };

        secondSmallest ob = new secondSmallest();

        System.out.println(ob.secondSmallest1(arr));
    }

}
