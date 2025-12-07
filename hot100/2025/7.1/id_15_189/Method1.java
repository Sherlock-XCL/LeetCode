import java.util.*;

public class Method1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
    
    public static void rotate(int[] nums, int k) {
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
