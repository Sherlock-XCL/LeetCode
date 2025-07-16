/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并 K 个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> a = new ArrayList<>();
        for (ListNode head : lists) {
            ListNode cur = head;
            while (cur != null) {
                a.add(cur.val);
                cur = cur.next;
            }
        }
        int[] ans = a.stream().mapToInt(i -> i).toArray();
        Arrays.sort(ans);
        ListNode k = new ListNode(0);
        ListNode x = k;
        for (int aa : ans) {
            x.next = new ListNode(aa);
            x = x.next;
        }
        return k.next;
    }
}
// @lc code=end

