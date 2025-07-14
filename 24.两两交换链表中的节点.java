/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {
        List<Integer> a = new ArrayList<>();
        ListNode cur = head, pre = null;
        int cnt = 0;
        while (cur != null) {
            cnt ++;
            if (cnt % 2 == 0) {
                // 先删数组最后的元素---
                a.remove(a.size() - 1);
                a.add(cur.val);
                a.add(pre.val);        
            } else {
                a.add(cur.val);
            }
            pre = cur;
            cur = cur.next;
            
        }
        ListNode k = new ListNode(0);
        ListNode ans = k;
        for (int x : a) {
            ans.next = new ListNode(x);
            ans = ans.next; 
        }
        return k.next;
    }
}
// @lc code=end

