package BinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class CounttotalNodesinaCOMPLETEBinaryTree {
    public int countNode(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + countNode(root.left) + countNode(root.right);

    }

    public static void main(String[] args) {
        CounttotalNodesinaCOMPLETEBinaryTree ob = new CounttotalNodesinaCOMPLETEBinaryTree();

        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        int totalNodes = ob.countNode(root);

        System.out.println("total number of nodes in the Complete" + totalNodes);
    }

}
