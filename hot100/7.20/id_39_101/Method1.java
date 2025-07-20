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
    boolean flag = true;
    public boolean isSymmetric(TreeNode root) {
        // 递归 - 对当前节点来说 如果其对称节点的左右子节点与当前节点左右子节点对称 那么继续往下递归
        return f(root.left, root.right);
    }
    public boolean f(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return flag;
        } else if (leftNode != null && rightNode != null && leftNode.val == rightNode.val) {
            // 这俩属于对称节点，可以继续往下走
            f(leftNode.left, rightNode.right);
            f(leftNode.right, rightNode.left);
        } else { 
            // 不对称了
            flag = false;
            return flag;
        }
        return flag;
    }
}
