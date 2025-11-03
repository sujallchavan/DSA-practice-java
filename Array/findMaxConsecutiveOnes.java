package Array;

public class findMaxConsecutiveOnes {
    public int MaxConsecutiveOnes(int[] arr) {
        int cnt = 0;
        int Max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            Max = Math.max(cnt, Max);
        }

        return Max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 2, 1, 0 };

        findMaxConsecutiveOnes ob = new findMaxConsecutiveOnes();

        int num = ob.MaxConsecutiveOnes(arr);

        System.out.println(num);
    }
}
