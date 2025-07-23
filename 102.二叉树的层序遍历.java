/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
 */
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val; 
        this.left = left;
        this.right = right;
    }
}

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return ans;
        }
        f(root, 0);
        return ans;
    }
    private void f(TreeNode root, int depth) {
        if (ans.size() == depth) {
            ans.add(new ArrayList<>());
        }
        if (root.left == null && root.right == null) {
            // 到达叶子节点
            ans.get(depth).add(root.val);
            return;
        } else {
            ans.get(depth).add(root.val);
            if (root.left != null) {
                f(root.left, depth + 1);
            }
            if (root.right != null) {
                f(root.right, depth + 1);
            }
        }

    }
}
// @lc code=end

