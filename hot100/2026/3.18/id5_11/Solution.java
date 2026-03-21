class Solution {
    // 对于短的一边，中间的任何一条线都无法与他构成更大的容器
    // 如果要找到比蓝色区域更大的容器，那么肯定不会包含这条线，所以可以直接去掉
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = -1;
        while (l < r) {
            int s = (r - l) * Math.max(height[l], height[r]);
            ans = Math.max(s, ans);
            if (height[l] > height[r]) r --;
            else l ++; 
        }
        return ans;
    }
}