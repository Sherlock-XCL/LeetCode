/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        return recur(cur, pre);
    }
    public ListNode recur(ListNode cur, ListNode pre) {
        // 边界条件
        if (cur == null) {
            return pre;
        }
        // cur = 5, pre = 4
        ListNode res = recur(cur.next, cur); // res = 5
        cur.next = pre;
        return res;
    }
}
// @lc code=end

