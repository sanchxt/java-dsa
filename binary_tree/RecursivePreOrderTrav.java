package binary_tree;

public class RecursivePreOrderTrav {
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

  public void preOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
  }

  public static void main(String[] args) {
    RecursivePreOrderTrav bt = new RecursivePreOrderTrav();
    bt.createBinaryTree();
    bt.preOrderTraversal(bt.root);
  }
}
