package Array;

public class MergeSortedArray {
    public void Merge(int[] nums1, int n, int[] nums2, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        for (int a : nums1) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int n = 3;
        int[] nums2 = { 2, 5, 6 };
        int m = 3;

        MergeSortedArray ob = new MergeSortedArray();

        ob.Merge(nums1, n, nums2, m);

    }

}
