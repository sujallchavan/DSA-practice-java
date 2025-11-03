package Array;

public class missingNumber {
    public int missingNumber1(int[] arr) {
        int n = arr.length;
        int totalSum = ((n + 1) * (n + 2)) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };

        missingNumber ob = new missingNumber();

        int num = ob.missingNumber1(arr);

        System.out.println(num);
    }
}
