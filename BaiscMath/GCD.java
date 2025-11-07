package BaiscMath;

public class GCD {

    public int GCD1(int n1, int n2) {
        int gcd = 1;

        for (int i = 1; i < Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        GCD ob = new GCD();

        int gcd = ob.GCD1(7, 8);

        System.out.println(gcd);
    }

}
