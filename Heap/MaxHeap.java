package Heap;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // start from index 1
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

    // ✅ Insert element
    public void insert(int val) {
        if (size >= capacity) {
            System.out.println("Heap is full!");
            return;
        }
        heap[++size] = val;
        int i = size;
        while (i > 1 && heap[i] > heap[parent(i)]) { // Bubble up (larger moves up)
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // ✅ Remove & return maximum element
    public int extractMax() {
        if (size == 0)
            return Integer.MIN_VALUE;
        int max = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return max;
    }

    // ✅ Maintain max-heap property
    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;

        if (left <= size && heap[left] > heap[largest])
            largest = left;
        if (right <= size && heap[right] > heap[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    // ✅ Print heap
    public void printHeap() {
        for (int i = 1; i <= size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(20);
        heap.insert(15);

        System.out.println("Max Heap:");
        heap.printHeap();

        System.out.println("Extracted Max: " + heap.extractMax());
        System.out.println("Heap after extraction:");
        heap.printHeap();
    }
}
