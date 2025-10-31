package Array;

public class largestEle {

    public int largestEle(int[] arr) {

        int larg = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }
        }

        return larg;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 5, 6 };

        largestEle ob = new largestEle();

        int largest = ob.largestEle(arr);

        System.out.println(largest);
    }

}
