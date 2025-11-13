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

public class lowestCommonAncestor {

    TreeNode root;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // recursive calls
        root.left = lowestCommonAncestor(root.left, p, q);
        root.right = lowestCommonAncestor(root.right, p, q);

        // if left side is null, return right
        if (root.left == null) {
            return root.right;
        }

        // if right side is null, return left
        else if (root.right == null) {
            return root.left;
        }

        // if both not null, current node is LCA
        return root;
    }

    // testing the code
    public static void main(String[] args) {
        lowestCommonAncestor tree = new lowestCommonAncestor();

        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(1);
        tree.root.left.left = new TreeNode(6);
        tree.root.left.right = new TreeNode(2);
        tree.root.right.left = new TreeNode(0);
        tree.root.right.right = new TreeNode(8);
        tree.root.left.right.left = new TreeNode(7);
        tree.root.left.right.right = new TreeNode(4);

        TreeNode p = tree.root.left; // Node 5
        TreeNode q = tree.root.left.right.right; // Node 4

        TreeNode lca = tree.lowestCommonAncestor(tree.root, p, q);

        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
    }
}
