import java.util.*;

public class Method2 {
    public static void main(String[] args) {
        Method2 method2 = new Method2();
        int[] nums = new int[1005];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        for (int i = 0; i < n; i ++) {
            nums[i] = sc.nextInt();
        }
        
        int[] ans = method2.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
        sc.close();
    } 
    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0};
    }
}
