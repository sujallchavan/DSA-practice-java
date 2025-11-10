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

public class inOrder {
    TreeNode root;

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);

        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public void inOrder1(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder1(root.left);
        System.out.println(root.val);
        inOrder1(root.right);
    }

    public static void main(String[] args) {
        inOrder ob = new inOrder();

        ob.root = ob.insert(ob.root, 1);
        ob.insert(ob.root, 03);
        ob.insert(ob.root, 2);

        ob.inOrder1(ob.root);
    }

}
