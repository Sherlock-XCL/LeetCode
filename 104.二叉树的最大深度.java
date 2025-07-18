/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */
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
    int ans = 1;
    public int maxDepth(TreeNode root) {
        int cnt = 0;
        if (root == null) {
            return cnt;
        } else {
            cnt = 1;
        }
        int ans = f(root, cnt);
        return ans;
    }
    private int f(TreeNode root, int cnt) {
        if (root.left != null) {
            f(root.left, cnt + 1);
        } else {
            ans = Math.max(cnt, ans);
        }
        if (root.right != null) {
            f(root.right, cnt + 1);
        } else {
            ans = Math.max(cnt, ans);
        }
        return ans;
    }
}
// @lc code=end

