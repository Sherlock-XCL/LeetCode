/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 */

// @lc code=start
import java.util.*;

class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) return;
        int i = nums.length - k;
        List<Integer> a = new ArrayList<>();
        int cnt = 0;
        while (cnt < nums.length) {
            a.add(nums[i]);
            i ++;
            if (i == nums.length) i = 0;
            cnt ++;
        }
        int[] ans = a.stream().mapToInt(Integer::intValue).toArray();
        System.arraycopy(ans, 0, nums, 0, ans.length);
    }
}
// @lc code=end

