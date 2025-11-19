package LeetCode;

public class KeepMultiplyingFoundValuesbyTwo2154 {

    public int findFinalValue(int[] nums, int orginal) {
        boolean found = true;

        while (found) {
            found = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == orginal) {
                    orginal = orginal * 2;
                    found = true;
                    break;
                }
            }

        }

        return orginal;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 6, 1, 12 };
        int orginal = 3;

        KeepMultiplyingFoundValuesbyTwo2154 ob = new KeepMultiplyingFoundValuesbyTwo2154();

        int n = ob.findFinalValue(nums, orginal);

        System.out.println(n);
    }
}