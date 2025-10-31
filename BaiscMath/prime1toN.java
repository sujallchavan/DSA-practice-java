package BaiscMath;

public class prime1toN {
    public void isPrime(int n) {

        for (int i = 2; i <= n; i++) {
            boolean flag = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println(i + "prime");
            } else {
                System.out.println(i + "not prime");
            }
        }

    }

    public static void main(String[] args) {

        int n = 100;

        prime1toN ob = new prime1toN();

        ob.isPrime(n);

    }
}
