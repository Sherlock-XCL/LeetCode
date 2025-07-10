/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start

import java.util.*;

class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> a = new ArrayList<>();
        if (k == 1) return nums;
        Deque<Integer> deque = new LinkedList<>();
        // 未形成窗口
        for (int i = 0; i < k; i ++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);    
        }
        a.add(deque.peekFirst());
        // 形成窗口后
        for (int i = k; i < nums.length; i ++) {
            if(deque.peekFirst() == nums[i - k]) 
                deque.removeFirst();
            while (!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            a.add(deque.peekFirst());
        }
        int[] ans = new int[100005];
        ans = a.stream().mapToInt(Integer::valueOf).toArray();
        return ans;
    }
}
// @lc code=end

