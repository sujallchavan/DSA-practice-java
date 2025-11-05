package Array;

public class twoSumB {
    public int[] twoSum(int[] arr, int target) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] + arr[j - i] == target) {
                    return new int[] { j, j - i };
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 4, 5 };

        twoSumB ob = new twoSumB();

        int[] ar = ob.twoSum(arr, 0);

        for (int a : ar) {
            System.out.println(a);
        }

    }
}
