package BaiscMath;

public class AramStrongNumber {
    public boolean ArmstrongNum(int num) {
        int n = num;
        int sum = 0;
        int k = String.valueOf(num).length();

        while (n > 0) {
            int id = n % 10;

            sum += Math.pow(id, k);

            n /= 10;
        }

        return sum == num ? true : false;
    }

    public static void main(String[] args) {
        int num = 370;

        AramStrongNumber ob = new AramStrongNumber();
        if (ob.ArmstrongNum(num)) {
            System.out.println("true");

        } else {
            System.out.println("False");
        }
    }

}
