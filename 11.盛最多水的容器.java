/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution11 {
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int s = (j - i) * h;
            if (s > area) area = s;
            if (height[i] < height[j]) i ++;
            else j --;
        }
        return area;
    }
}
// @lc code=end

