public class Method1 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        // dp[i] 表示以nums[i]结尾的连续子数组的最大和
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            // 如果以nums[i - 1]结尾的连续子数组的最大和小于等于 0 
            // 那么以nums[i]结尾的连续子数组的最大和 便不需要考虑之前的，即另起炉灶
            if (dp[i - 1] <= 0) {
                dp[i] = nums[i];
            } else {
                // 如果以nums[i - 1]结尾的连续子数组的最大和大于 0
                // 递推：那么以nums[i]结尾的连续子数组的最大和 = dp[i - 1] + nums[i]
                dp[i] = dp[i - 1] + nums[i];
            }
        }
        int ans = dp[0];
        for (int i = 0; i < dp.length; i ++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
