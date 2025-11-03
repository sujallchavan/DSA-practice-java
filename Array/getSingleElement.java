package Array;

//  Find the number that appears once, and other numbers twice.
public class getSingleElement {
    public int getSingleElement1(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    cnt++;
                }
            }

            if (cnt == 1)
                return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };

        getSingleElement ob = new getSingleElement();

        int n = ob.getSingleElement1(arr);

        System.out.println(n);
    }

}
