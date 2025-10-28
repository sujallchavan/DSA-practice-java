package BaiscMath;

public class isPalindrom {
    public boolean checkPalindrom(int n) {
        int rev = 0;
        int orginal = n;

        while (n > 0) {
            int dight = n % 10;
            rev = rev * 10 + dight;
            n /= 10;
        }
        if (orginal == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 11211;

        isPalindrom ob = new isPalindrom();

        if (ob.checkPalindrom(n)) {
            System.out.println(n + "is palindrom");
        } else {
            System.out.println(n + "is not palindrom");
        }
    }

}
