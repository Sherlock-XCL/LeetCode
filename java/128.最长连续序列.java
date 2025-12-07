/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start

import java.util.Arrays;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        // 对nums 排序 O(nlogn)
        Arrays.sort(nums);
        int cnt = 1;
        int ans = 1;
        if (nums.length == 0) ans = 0;
        // 遍历数组 
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] - nums[i - 1] == 1) {
                cnt ++;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                cnt = 1;
            }
            if (cnt > ans) ans = cnt;
        }
        return ans;
    }
}
// @lc code=end

