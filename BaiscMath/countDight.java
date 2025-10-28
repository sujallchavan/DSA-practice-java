package BaiscMath;

public class countDight {
    public int countDight(int N) {
        int cnt = 0;
        int orginal = N;

        while (N > 0) {
            int dight = N % 10;

            // if (dight != 0 && orginal % dight == 0) {
            cnt = cnt + 1;
            // }

            N = N / 10;

        }

        return cnt;
    }

    public static void main(String[] args) {

        int N = 10;

        countDight ob = new countDight();

        int cnt = ob.countDight(N);

        System.out.println(cnt);
    }
}
