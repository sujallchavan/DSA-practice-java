package BaiscMath;

public class sumOfAllDivisoers {

    public int sumOfAllDivisoerss(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= i; j++) {
                if (j % i == 0) {
                    sum += j;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 12;

        sumOfAllDivisoers ob = new sumOfAllDivisoers();

        System.out.println(ob.sumOfAllDivisoerss(num));
    }

}
