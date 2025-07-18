class Method1 {
    // 按列计算
    // 只有较小的一段大于当前列的高度才会有水，其他情况不会有水
    public int trap(int[] height) {
        int ans = 0;
        for (int i = 1; i < height.length - 1; i ++) {
            int max_left = 0;
            for (int j = i - 1; j >= 0; j --) {
                if (height[j] > max_left) max_left = height[j];
            }
            int max_right = 0;
            for (int j = i + 1; j < height.length; j ++) {
                if (height[j] > max_right) max_right = height[j];
            }
            int min = Math.min(max_left, max_right);
            if (min > height[i]) ans += min - height[i];
        }
        return ans;
    }
}