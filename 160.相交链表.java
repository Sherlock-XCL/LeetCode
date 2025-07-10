/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
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
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        while (A != B) {
            if (A != null) A = A.next;
            else A = headB;
            if (B != null) B = B.next;
            else B = headA;
        }
        return A;
    }
}
// @lc code=end

