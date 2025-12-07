/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = nums.length + 1;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right ++) {
            sum += nums[right];
            while (sum - nums[left] >= target) {
                sum -= nums[left];
                left ++;
            }
            if (sum >= target) {
                ans = Math.min(ans, right - left + 1);
            }
        }
        return ans <= nums.length ? ans : 0 ;
    }
}
// @lc code=end

