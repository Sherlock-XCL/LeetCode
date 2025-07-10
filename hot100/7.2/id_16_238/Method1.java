public class Method1 {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int cnt0 = 0;
        for (int num : nums) {
            if (num == 0) cnt0 ++;
            sum *= num;
            if (cnt0 == 2) break;
        }
        int[] ans = new int[nums.length];
        if (cnt0 == 2) {
            return ans;
        }
        // 只有零个或一个0
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 0) {
                int tmpSum = 1;
                for (int j = 0; j < nums.length; j ++) {
                    if (j != i) tmpSum *= nums[j];
                }
                ans[i] = tmpSum;
                continue;
            }
            ans[i] = sum / nums[i];
        }
        return ans;
    }
    
}