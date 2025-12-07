import java.util.*;

public class Method1 {
    public static void main(String[] args) {
        Method1 method1 = new Method1();

        // Scanner sc = new Scanner(System.in);
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = method1.twoSum(nums, target);
        System.out.print(Arrays.toString(ans));
    }

    private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}