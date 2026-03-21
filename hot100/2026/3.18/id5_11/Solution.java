class Solution {
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