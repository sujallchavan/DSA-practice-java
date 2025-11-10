package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class preorderTraversalStack {
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

    public List<Integer> preorder(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            root = stack.pop();

            list.add(root.val);

            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }

        return list;
    }

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.add(root);

        while (!stack1.isEmpty()) {
            root = stack1.pop();

            stack2.push(root);

            if (root.left != null) {
                stack1.push(root.left);
            }

            if (root.right != null) {
                stack1.push(root.right);
            }
        }

        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }
        return result;
    }

    public static void main(String[] args) {
        preorderTraversalStack ob = new preorderTraversalStack();

        ob.root = ob.insert(ob.root, 1);
        ob.insert(ob.root, 5);
        ob.insert(ob.root, 2);
        ob.insert(ob.root, 7);

        List<Integer> l = ob.preorder(ob.root);

        for (int a : l) {
            System.out.println(a);
        }

        System.out.println("postOrder");

        List<Integer> ans = ob.postOrder(ob.root);

        for (int a : ans) {
            System.out.println(a);
        }
    }

}
