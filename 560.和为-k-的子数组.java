/*
 * @lc app=leetcode.cn id=560 lang=java
 *
 * [560] 和为 K 的子数组
 */

// @lc code=start

import java.util.*;

class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i ++) {
            int num = nums[i];
            prefixSum += num;
            if (map.containsKey(prefixSum - k)) {
                ans += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return ans;
    }
}
// @lc code=end

