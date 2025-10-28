package recusion;

public class print1toN {
    public void print1toN(int N) {
        if (N == 0)
            return;

        print1toN(N - 1); // call first for smaller numbers
        System.out.println(N); // print after recursion
    }

    public static void main(String[] args) {
        int N = 5;

        print1toN ob = new print1toN();
        ob.print1toN(N);
    }
}
