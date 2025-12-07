/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {
        List<Integer> a = new ArrayList<>();
        while (head != null) {
            a.add(head.val);
            head = head.next;
        }
        int[] ans = a.stream().mapToInt(i -> i).toArray();
        Arrays.sort(ans);
        ListNode k = new ListNode(0);
        ListNode l = k;
        for (int x : ans) {
            l.next = new ListNode(x);
            l = l.next;
        }
        return k.next;
    }
}
// @lc code=end

