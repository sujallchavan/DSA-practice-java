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

public class binaryTree {
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

    public void preOrder(TreeNode root) {
        if (root == null) {

            return;
        }

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        binaryTree ob = new binaryTree();

        ob.root = ob.insert(ob.root, 1);

        ob.insert(ob.root, 2);
        ob.insert(ob.root, 3);
        ob.insert(ob.root, 4);
        ob.insert(ob.root, 5);

        ob.preOrder(ob.root);
    }

}
