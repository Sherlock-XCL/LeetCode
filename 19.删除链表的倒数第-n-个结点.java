/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {}
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
    // 反转两次？
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode l1 = reverse(head);
        ListNode ans;

        int cnt = 1;
        ListNode pre = null;
        ListNode cur = l1;
        // 遍历到第 n 个节点的前一个节点
        while (cnt < n && cur != null) {
            pre = cur;
            cur = cur.next;
            cnt++;
        }
        // 删除第 n 个节点
        if (cur != null) {
            if (pre == null) {
                // 如果要删除的是第一个节点
                l1 = cur.next;
            } else {
                // 删除非头节点
                pre.next = cur.next;
            }
        }

        ans = reverse(l1);
        return ans;
    }
    private ListNode reverse(ListNode a) {
        ListNode cur = a, pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
// @lc code=end

