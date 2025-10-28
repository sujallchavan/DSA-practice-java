package recusion;

public class printNto1 {
    public void printnto1(int N) {
        if (N == 0)
            return;

        System.out.println(N);

        printnto1(N - 1);
    }

    public static void main(String[] args) {
        int N = 5;

        printNto1 ob = new printNto1();

        ob.printnto1(N);
    }
}
