package Array;

public class NumberofSubstringsWithOnly1s {
    public int numSub(String s) {
        int n = s.length();
        int cnt = 0;
        int mod = (int) 1e9 + 7;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                for (int j = i; j < n && s.charAt(j) == 1; j++) {
                    cnt = (cnt + 1) % mod;
                }
            }
        }

        return cnt;
    }

}
