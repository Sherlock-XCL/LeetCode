/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public boolean hasCycle(ListNode head) {
        // 快慢指针 - 龟兔赛跑
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null) {
                return false;
            }
            slow = slow.next;
            if (fast.next == null) return false;
            fast = fast.next.next;
        }
        return true;
    }
}
// @lc code=end

