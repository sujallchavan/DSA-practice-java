package recusion;

public class printName {
    public void printName(int N) {
        if (N == 0)
            return;

        System.out.println("sujal");

        printName(N - 1);
    }

    public static void main(String[] args) {
        int N = 5;

        printName ob = new printName();

        ob.printName(N);
    }
}
