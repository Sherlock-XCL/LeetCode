public class Method2 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        // 规定pre[i] 为 nums[i]左边的乘积，suf[i] 为nums[i]右边的乘积
        int[] pre = new int[n]; // 前缀积
        int[] suf = new int[n]; // 后缀积
        pre[0] = 1;
        suf[n - 1] = 1;
        for (int i = 1; i < n; i ++) {
            pre[i] = pre[i - 1] * nums[i - 1]; // 递推
        }
        for (int i = n - 2; i >= 0; i --) {
            suf[i] = suf[i + 1] * nums[i + 1]; // 递推
        }
        for (int i = 0; i < n; i ++) {
            ans[i] = pre[i] * suf[i];
        }
        return ans;
    }
}
