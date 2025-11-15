package BST;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class RecoverBST {

    TreeNode first;
    TreeNode second;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE); // Initialize prev to avoid NullPointerException

    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }

        helper(root);

        // Swap values of the two misplaced nodes
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    public void helper(TreeNode node) {
        if (node == null) {
            return;
        }

        // In-order traversal
        helper(node.left);

        // Detect swapped nodes
        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev; // First violation
            }
            second = node; // Second violation (or update in case of adjacent swaps)
        }

        prev = node;

        helper(node.right);
    }

    // In-order traversal: Left -> Node -> Right
    public static void printInOrder(TreeNode root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        /*
         * Construct this BST:
         * 3
         * / \
         * 1 4
         * /
         * 2
         * 
         * But the nodes 2 and 3 are swapped in structure:
         * 2
         * / \
         * 1 4
         * /
         * 3
         * 
         * Correct in-order should be: 1 2 3 4
         * But the tree structure is wrong,
         * So the in-order traversal looks sorted but violates BST rules internally.
         */

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3); // Swapped with root supposed to be 3

        RecoverBST solution = new RecoverBST();

        // Before recovery
        System.out.println("Before recovery (in-order): ");
        printInOrder(root);

        // Recover the tree
        solution.recoverTree(root);

        // After recovery
        System.out.println("\nAfter recovery (in-order): ");
        printInOrder(root);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// class Solution {
// TreeNode fist;
// TreeNode second;
// TreeNode prev;

// public void recoverTree(TreeNode root) {
// if (root == null) {
// return;
// }

// helper(root);

// int temp = fist.val;
// fist.val = second.val;
// second.val = temp;
// }

// public void helper(TreeNode node) {
// if (node == null) {
// return;
// }

// helper(node.left);

// if (prev != null && prev.val > node.val) {
// if (fist == null) {
// fist = prev;
// }

// second = node;
// }

// prev = node;

// helper(node.right);
// }
// }