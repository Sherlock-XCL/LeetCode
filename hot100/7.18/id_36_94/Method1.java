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

public class Method1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }
    private void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorder(root.left, ans);
        }
        ans.add(root.val);
        if (root.right != null) {
            inorder(root.right, ans);
        }
    }
}
