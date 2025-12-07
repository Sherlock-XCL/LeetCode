import java.util.*;

public class Method1 {
    public int firstMissingPositive(int[] nums) {
        int ans = 1;
        Arrays.sort(nums);
        nums = Arrays.stream(nums).sorted().distinct().toArray();
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > 0) {
                int k = i;
                while(k < nums.length && ans == nums[k]) {
                    k ++;
                    ans ++;
                }
                return ans;
            } 
        }
        return ans;
    }
}
