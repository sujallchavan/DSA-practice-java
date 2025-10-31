package BaiscMath;

public class checkPrime {

    public boolean checkPrime1(int num) {

        int cnt = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                cnt = cnt + 1;
            }
        }

        if (cnt == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 7;

        checkPrime ob = new checkPrime();

        if (ob.checkPrime1(num)) {
            System.out.println(num + "is Prime");
        } else {
            System.out.println(num + "not prime");
        }
    }

}
