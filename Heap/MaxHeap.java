package Heap;

import Array.productExceptSelf;

public class MaxHeap {
    private int heap[];
    private int capacity;
    private int size;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1];
    }

    private int parent(int i) {
        return i / 2;
    }

    private int leftChild(int i) {
        return 2 * i;
    }

    private int rightChild(int i) {
        return 2 * i + 1;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int val) {
        if (size >= capacity) {
            System.out.println("full");
        }

        heap[++size] = val;
        int i = size;

        while (i > 1 && heap[i] > heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public int MaxVal() {
        if (size == 0) {
            return 0;
        }

        int max = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return max;
    }

    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;

        while (left <= size && heap[left] > heap[largest]) {
            largest = left;
        }

        while (right <= size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }

    }

    public static void main(String[] args) {
        MaxHeap ob = new MaxHeap(5);

        ob.insert(1);
        ob.insert(22);
        ob.insert(21);
        ob.insert(4);

        System.out.println("max ele");

        int m = ob.MaxVal();

        System.out.println(m);
    }

}
