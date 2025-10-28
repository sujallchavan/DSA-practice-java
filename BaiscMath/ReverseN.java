package BaiscMath;

public class ReverseN {
    public int ReverseN1(int N) {
        int rev = 0;
        while (N != 0) {
            int dight = N % 10;
            rev = rev * 10 + dight;

            N /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int n = 12345;

        ReverseN ob = new ReverseN();

        int num = ob.ReverseN1(n);

        System.out.println(num);
    }

}
