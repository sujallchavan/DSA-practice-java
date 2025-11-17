package Array;

public class CheckIfAll1sAreatLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        int lastIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (lastIndex != -1 && i - lastIndex - 1 < k) {
                    return false;
                }
                lastIndex = i;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 0, 1, 0, 0, 1 };

        CheckIfAll1sAreatLeastLengthKPlacesAway ob = new CheckIfAll1sAreatLeastLengthKPlacesAway();

        boolean flag = ob.kLengthApart(nums, 2);

        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
