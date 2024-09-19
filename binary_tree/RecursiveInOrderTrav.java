package binary_tree;

public class RecursiveInOrderTrav {
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

  public void inOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.print(root.data + " ");
    inOrderTraversal(root.right);
  }

  public static void main(String[] args) {
    RecursiveInOrderTrav bt = new RecursiveInOrderTrav();
    bt.createBinaryTree();
    bt.inOrderTraversal(bt.root);
  }
}
