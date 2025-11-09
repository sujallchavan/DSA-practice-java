package Heap;

import java.util.PriorityQueue;

class listNode {
    int val;
    listNode next;

    listNode(int x) {
        val = x;
        next = null;
    }
}

// Merge K Sorted Lists class
public class mergeKLists {

    public listNode mergeKLists1(listNode[] lists) {
        // Min-heap (priority queue)
        PriorityQueue<listNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add first node of each list into the heap
        for (listNode node : lists) {
            if (node != null)
                pq.add(node);
        }

        // Dummy node to start the merged list
        listNode dummy = new listNode(0);
        listNode tail = dummy;

        // While heap is not empty
        while (!pq.isEmpty()) {
            listNode smallest = pq.poll(); // Get node with smallest value
            tail.next = smallest; // Add to result
            tail = tail.next;

            // If this node has a next, add it to heap
            if (smallest.next != null) {
                pq.add(smallest.next);
            }
        }

        // Return the merged list head
        return dummy.next;
    }

    // Driver function for testing
    public static void main(String[] args) {
        mergeKLists sol = new mergeKLists();

        // Create 3 sorted linked lists
        listNode list1 = new listNode(1);
        list1.next = new listNode(4);
        list1.next.next = new listNode(5);

        listNode list2 = new listNode(1);
        list2.next = new listNode(3);
        list2.next.next = new listNode(4);

        listNode list3 = new listNode(2);
        list3.next = new listNode(6);

        listNode[] lists = { list1, list2, list3 };

        // Merge all lists
        listNode result = sol.mergeKLists1(lists);

        // Print merged linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
