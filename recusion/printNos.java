package recusion;

public class printNos {
    public void printNos1(int N) {
        if (N == 0)
            return;

        printNos1(N - 1);

        System.out.println(N);
    }

    public static void main(String[] args) {
        int N = 4;

        printNos obj = new printNos();
        obj.printNos1(N);
    }
}
