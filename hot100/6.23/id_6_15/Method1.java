import java.util.*;

class Method1 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet();
        List<Integer> a;
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                for (int k = j + 1; k < nums.length; k ++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        a = new ArrayList<Integer>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        Collections.sort(a);
                        ans.add(a);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}