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

public class Method1 {
    private int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }
    private int dfs(TreeNode root) {
        // 到叶子节点
        if (root == null) {
            return -1;
        }
        int l_len = dfs(root.left) + 1;
        int r_len = dfs(root.right) + 1;
        ans = Math.max(ans, l_len + r_len);
        return Math.max(l_len, r_len);
    }
}
