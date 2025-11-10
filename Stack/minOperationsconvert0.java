package Stack;

import java.util.Stack;

public class minOperationsconvert0 {
    public int minOperations(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() > num) {
                stack.pop();
                ans++;
            }

            if (num != 0 && (stack.isEmpty() || stack.peek() != num)) {
                stack.push(num);
            }
        }

        return ans + stack.size();
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2 };
        minOperationsconvert0 ob = new minOperationsconvert0();

        int n = ob.minOperations(nums);

        System.out.println(n);
    }
}
