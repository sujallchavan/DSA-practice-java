package recusion;

public class factorial {
    public int factorial1(int N) {
        if (N == 0)
            return 1;

        return N * factorial1(N - 1);
    }

    public static void main(String[] args) {
        int N = 5;

        factorial ob = new factorial();

        int fcat = ob.factorial1(N);

        System.out.println(fcat);
    }
}
