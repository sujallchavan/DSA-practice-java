package Array;

public class majorityElementB {
    public int majorityElement(int[] arr) {
        int maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }

            if (cnt > (arr.length / 2)) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 1, 3, 4, 1, 1 };

        majorityElementB ob = new majorityElementB();

        int n = ob.majorityElement(arr);

        System.out.println(n);
    }

}
