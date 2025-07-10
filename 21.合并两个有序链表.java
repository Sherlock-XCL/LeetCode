/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */
// import java.util.*;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // List<Integer> ans = new ArrayList<>();
        // l1 = [1, 2, 4, 10]
        // l2 = [3, 4, 5, 6]
        while (list1 != null && list2 != null) {
            while (list1.val < list2.val) {
                list1 = list1.next;
            }
            list1.next = list2;

            while (list2.val < list1.val) {
                list2 = list2.next;
            }
            list2.next = list1;
        }
        return null;
    }
}
// @lc code=end

