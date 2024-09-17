package binary_tree;

import java.util.Stack;

public class IterativePreOrderTrav {
  private TreeNode root;

  public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
      this.data = data;
    }
  }

  public void createBinaryTree() {
    TreeNode first = new TreeNode(9);
    TreeNode second = new TreeNode(2);
    TreeNode third = new TreeNode(3);
    TreeNode fourth = new TreeNode(4);

    root = first;
    first.left = second;
    first.right = third;
    second.left = fourth;
  }

  public void preOrderTraversal() {
    if (root == null) {
      return;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode temp = stack.pop();
      System.out.print(temp.data + " ");
      if (temp.right != null) {
        stack.push(temp.right);
      }
      if (temp.left != null) {
        stack.push(temp.left);
      }
    }
  }

  public static void main(String[] args) {
    IterativePreOrderTrav bt = new IterativePreOrderTrav();
    bt.createBinaryTree();
    bt.preOrderTraversal();
  }
}
