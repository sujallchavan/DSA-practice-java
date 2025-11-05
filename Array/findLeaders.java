package Array;

import java.util.ArrayList;

public class findLeaders {
    public ArrayList<Integer> findLeader(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        if (n == 0)
            return list;
        int maxEle = arr[n - 1];
        list.add(maxEle);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxEle) {
                list.add(arr[i]);
                maxEle = arr[i];
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        findLeaders ob = new findLeaders();

        ArrayList<Integer> list = ob.findLeader(arr);

        for (int a : list) {
            System.out.println(a);
        }

    }
}
