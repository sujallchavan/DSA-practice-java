package Heap;

public class isMinHeap {
    public boolean isMinHeap1(int[] arr, int size) {

        for (int i = 0; i <= (size - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size && arr[i] > arr[left]) {
                return false;
            }

            if (right < size && arr[i] > arr[right]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 20, 11, 22, 21 };
        isMinHeap ob = new isMinHeap();

        boolean flag = ob.isMinHeap1(arr, 5);

        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}
