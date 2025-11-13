package Array;

public class FindFirstandLastPositionofElementinSortedArray {
    public int[] findFirstAndLastPosition(int[] num, int target) {

        int first = -1;
        int last = -1;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                if (first == -1) {
                    first = i; // store first occurrence
                }
                last = i; // keep updating last occurrence
            }
        }

        return new int[] { first, last };
    }

    // Example main method to test
    public static void main(String[] args) {
        FindFirstandLastPositionofElementinSortedArray obj = new FindFirstandLastPositionofElementinSortedArray();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = obj.findFirstAndLastPosition(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
