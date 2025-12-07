public class Method2 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i ++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int j = nums[i] - 1;
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }    
}
