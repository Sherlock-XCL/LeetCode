/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 */

import java.util.*;

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
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        List<Integer> a = new ArrayList<>();
        while (cur != null) {
            a.add(cur.val);
            cur = cur.next;
        }
        for (int i = 0; i < a.size() / 2; i++) {
            if (a.get(i) != a.get(a.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

