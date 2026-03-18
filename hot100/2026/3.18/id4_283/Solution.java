import java.util.*;

// 移动零 - 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

// 输入: nums = [0,1,0,3,12]
// 输出: [1,3,12,0,0]

// 左指针左边均为非零数；
// 右指针左边直到左指针处均为零。
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                swap(l, r, nums);
                l ++;
            }
            r ++;
        }
    }

    private void swap(int l, int r, int[] nums) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
