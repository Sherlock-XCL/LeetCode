/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution42 {
    public int trap(int[] height) {
        int ans = 0;
        int max_left[] = new int[height.length];
        int max_right[] = new int[height.length];
        for (int i = 1; i < height.length; i ++) {
            max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
        }
        for (int i = height.length - 2; i >= 0; i --) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }
        for (int i = 1; i < height.length - 1; i ++) {
            int min = Math.min(max_left[i], max_right[i]);
            if (min > height[i]) ans += min - height[i];
        }
        return ans;
    }
}
// @lc code=end

