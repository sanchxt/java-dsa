package binary_tree;

public class RecursivePostOrderTrav {
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

  public void recursivePostOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    recursivePostOrderTraversal(root.left);
    recursivePostOrderTraversal(root.right);
    System.out.print(root.data + " ");
  }

  public static void main(String[] args) {
    RecursivePostOrderTrav bt = new RecursivePostOrderTrav();
    bt.createBinaryTree();
    bt.recursivePostOrderTraversal(bt.root);
  }
}
