package Array;

public class checkSorted {
    public boolean check(int[] arr) {
        int n = arr.length;
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                cnt++;
            }
        }

        if (arr[n - 1] > arr[0]) {
            cnt++;
        }

        return cnt <= 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        checkSorted ob = new checkSorted();

        if (ob.check(arr)) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
