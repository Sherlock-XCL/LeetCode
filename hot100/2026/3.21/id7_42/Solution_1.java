class Solution_1 {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max_l = -1, max_r = -1;
        // 左右前缀最大值
        for (int i = 0; i < height.length; i ++) {
            max_l = Math.max(height[i], max_l);
            left[i] = max_l;
        }
        for (int i = height.length - 1; i > 0; i --) {
            max_r = Math.max(height[i], max_r);
            right[i] = max_r;
        }
        int ans = 0;
        for (int i = 0; i < height.length - 1; i ++) {
            int k = Math.abs(left[i] - right[i]) - height[i];
            if (k > 0) {
                ans += k;
            }
        }
        return ans;
    }
}