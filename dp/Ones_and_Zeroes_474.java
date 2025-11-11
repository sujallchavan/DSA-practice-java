package dp;

public class Ones_and_Zeroes_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String s : strs) {
            int zero = 0;
            int ones = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zero++;
                } else {
                    ones++;
                }
            }

            for (int i = m; i >= zero; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - zero][j - ones]);
                }
            }
        }

        return dp[m][n];

    }

    public static void main(String[] args) {
        Ones_and_Zeroes_474 obj = new Ones_and_Zeroes_474();

        String[] strs = { "10", "0001", "111001", "1", "0" };
        int m = 5;
        int n = 3;

        int result = obj.findMaxForm(strs, m, n);
        System.out.println("Maximum number of strings that can be formed = " + result);
    }

}
