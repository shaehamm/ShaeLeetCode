package com.sparklefish;

public class MaximumDepthOfBinaryTree {
  public int maxDepth(TreeNode root) {

    if (root == null) return 0;
    int right = maxDepth(root.right);
    int left = maxDepth(root.left);

    return Math.max(right, left) + 1;
  }
}
