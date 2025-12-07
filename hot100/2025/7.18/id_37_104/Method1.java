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

    public static void main(String[] args) {
        // 构建二叉树 [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Method1 solution = new Method1();
        int depth = solution.maxDepth(root);
        System.out.println("最大深度为: " + depth);
    }
}