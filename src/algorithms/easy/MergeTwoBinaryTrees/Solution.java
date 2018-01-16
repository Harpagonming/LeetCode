package algorithms.easy.MergeTwoBinaryTrees;

public class Solution {
  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    TreeNode t = new TreeNode(t1.val + t2.val);
    if (t1.left == null && t2.left == null) {
      t.left = null;
    } else if (t1.left == null) {
      t.left = t2.left;
    } else if (t2.left == null) {
      t.left = t1.left;
    } else {
      t.left = mergeTrees(t1.left, t2.left);
    }

    if (t1.right == null && t2.right == null) {
      t.right = null;
    } else if (t1.right == null) {
      t.right = t2.right;
    } else if (t2.right == null) {
      t.right = t1.right;
    } else {
      t.right = mergeTrees(t1.right, t2.right);
    }
    return t;
  }

}
