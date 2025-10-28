package recusion;

public class sum1toN {
    public int sum1toN1(int N) {
        if (N == 0)
            return 0;

        return N + sum1toN1(N - 1);
    }

    public static void main(String[] args) {
        int N = 5;

        sum1toN ob = new sum1toN();

        int n = ob.sum1toN1(N);

        System.out.println(n);
    }
}
