import java.util.*;

class Method2 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 1, 1, 2};
        System.out.println(threeSum(nums));
    }
   public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > 0) break;
            // 跳过重复值
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l ++;
                    r --;
                    // 跳过重复值
                    while (l < r && nums[l] == nums[l - 1]) l ++;
                    while (l < r && nums[r] == nums[r + 1]) r --;
                } else if(nums[l] + nums[r] < target) {
                    l ++;
                    while (l < r && nums[l] == nums[l - 1]) l ++;
                } else {
                    r --;
                    while (l < r && nums[r] == nums[r + 1]) r --;
                }
            }
        }
        return ans;
    }
}
