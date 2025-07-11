/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode k = new ListNode(0); // 虚拟头节点
        ListNode ans = new ListNode();
        ans = k;
        int tmp = 0;
        while (l1 != null && l2 != null) {
            int x = (l1.val + l2.val + tmp) % 10;
            ans.next = new ListNode(x);
            ans = ans.next;
            tmp = (l1.val + l2.val + tmp) / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int x = (l1.val + tmp) % 10;
            ans.next = new ListNode(x);
            ans = ans.next;
            tmp = (l1.val + tmp) / 10;
            l1 = l1.next;
        }
        while (l2 != null) {
            int x = (l2.val + tmp) % 10;
            ans.next = new ListNode(x);
            ans = ans.next;
            tmp = (l2.val + tmp) / 10;
            l2 = l2.next;
        }
        if (tmp != 0) {
            ans.next = new ListNode(tmp);
            ans = ans.next;
        }
        return k.next;
    }
}
// @lc code=end

