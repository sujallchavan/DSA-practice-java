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

public class postOrder {

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

    public void postOrder1(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder1(root.left);
        postOrder1(root.right);
        System.out.println(root.val);
    }

    public static void main(String[] args) {
        postOrder ob = new postOrder();

        ob.root = ob.insert(ob.root, 1);
        ob.insert(ob.root, 3);
        ob.insert(ob.root, 2);

        ob.postOrder1(ob.root);
    }

}
