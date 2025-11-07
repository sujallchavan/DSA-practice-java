package Heap;

public class MinHeap {
    private int heap[];
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity + 1];
        this.size = 0;
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
            return;
        }

        heap[++size] = val;

        int i = size;

        while (i > 1 && heap[i] < heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public int ExtractMin() {
        if (size == 0) {
            return 0;
        }

        int min = heap[1];
        heap[1] = heap[size--];
        heapify(1);

        return min;
    }

    public void heapify(int val) {
        int left = leftChild(val);
        int right = rightChild(val);
        int smallest = val;

        while (left <= size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        while (right <= size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != val) {
            swap(smallest, val);
            heapify(smallest);
        }
    }

    public static void main(String[] args) {

        MinHeap ob = new MinHeap(5);

        ob.insert(1);
        ob.insert(22);
        ob.insert(21);
        ob.insert(4);

        System.out.println("min");

        int n = ob.ExtractMin();

        System.out.println(n);

    }

}
