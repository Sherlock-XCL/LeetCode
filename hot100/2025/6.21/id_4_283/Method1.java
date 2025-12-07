import java.util.*;

class Method1 {
    public void moveZeroes(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 0){
                cnt ++;
                continue;
            }
            ans.add(nums[i]);
        } 
        for (int i = 1; i <= cnt; i ++) {
            ans.add(0);
        }
        for (int i = 0; i < nums.length; i ++) nums[i] = ans.get(i);
    }
}
