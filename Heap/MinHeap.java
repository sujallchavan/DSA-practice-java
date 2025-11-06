package Heap;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // index starts from 1 for simplicity
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

    // Insert element
    public void insert(int val) {
        if (size >= capacity) {
            System.out.println("Heap is full!");
            return;
        }
        heap[++size] = val;
        int i = size;
        while (i > 1 && heap[i] < heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Remove and return the smallest element
    public int extractMin() {
        if (size == 0)
            return Integer.MIN_VALUE;
        int min = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return min;
    }

    // Heapify down
    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left <= size && heap[left] < heap[smallest])
            smallest = left;
        if (right <= size && heap[right] < heap[smallest])
            smallest = right;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(20);
        heap.insert(15);

        System.out.println("Min Heap:");
        heap.printHeap();

        System.out.println("Extracted Min: " + heap.extractMin());
        System.out.println("Heap after extraction:");
        heap.printHeap();
    }
}
