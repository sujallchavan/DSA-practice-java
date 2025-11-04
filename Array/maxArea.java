package Array;

// Container With Most Water..

public class maxArea {

    public int maxArea1(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int maxA = Integer.MIN_VALUE;

        while (l < r) {
            int lh = height[l];
            int rh = height[r];

            int min_height = Math.min(lh, rh);
            maxA = Math.max(maxA, min_height * (r - l));

            if (lh < rh) {
                l++;
            } else {
                r--;
            }
        }

        return maxA;
    }

    public static void main(String[] args) {
        int[] height = { 1, 2, 3, 4, 5, 7 };

        maxArea ob = new maxArea();

        int n = ob.maxArea1(height);

        System.out.println(n);
    }

}
