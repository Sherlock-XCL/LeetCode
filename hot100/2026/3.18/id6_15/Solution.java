import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 三数之和
// 输入：nums = [-1,0,1,2,-1,-4]。-4 -1 -1 0 1 2
// 输出：[[-1,-1,2],[-1,0,1]]      i  j        k
// 解释：
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
// 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
// 注意，输出的顺序和三元组的顺序并不重要。

// 排序 + 双指针
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                List<Integer> tmp = new ArrayList<>();
                int x = nums[j] + nums[k];
                if (x + nums[i] < 0) { // 不够大 j右移
                    j ++;
                    while (j < k && nums[j] == nums[j - 1]) j ++;
                } else if (x + nums[i] < 0) {
                    k --;
                    while (j < k && nums[k] == nums[k - 1]) k --;
                } else {
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    j ++;
                    k --;
                    while (j < k && nums[j] == nums[j - 1]) j ++;
                    while (j < k && nums[k] == nums[k - 1]) k --;
                }
                ans.add(tmp);
            }
        }
        return ans;
    }
}