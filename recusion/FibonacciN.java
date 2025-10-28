package recusion;

public class FibonacciN {
    public int fib(int N, int a, int b) {

        if (N == 0)
            return 0;

        System.out.println(a + " ");

        return fib(N - 1, b, a + b);
    }

    public static void main(String[] args) {
        int n = 5;

        FibonacciN ob = new FibonacciN();

        ob.fib(n, 0, 1);

    }
}
