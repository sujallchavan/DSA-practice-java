package Array;

public class majorityElementO {
    public int majorityEleO(int[] arr) {
        int count = 0;
        int maxEle = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                maxEle = arr[i];
            }

            if (arr[i] == maxEle) {
                count++;

            } else {
                count--;
            }
        }

        return maxEle;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 1, 1 };

        majorityElementO ob = new majorityElementO();

        int n = ob.majorityEleO(arr);

        System.out.println(n);
    }
}
