package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class LevelOrder {

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

    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.println(curr.val);

            if (curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);
        }

    }

    public static void main(String[] args) {
        LevelOrder ob = new LevelOrder();

        ob.root = ob.insert(ob.root, 1);
        ob.insert(ob.root, 2);
        ob.insert(ob.root, 3);
        ob.insert(ob.root, 4);
        ob.insert(ob.root, 5);

        ob.levelOrder(ob.root);
    }

}
