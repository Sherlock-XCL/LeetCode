/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> a = new ArrayList<>();
        ListNode cur = head;
        int cnt = 0, i = 0;
        while (cur != null) {
            cnt ++;
            a.add(cur.val);
            if (cnt % k == 0) {
                // 反转
                swap(a, i, cnt - 1);
                i = cnt;
            }
            cur = cur.next;
        }
        ListNode x = new ListNode(0);
        ListNode ans = x;
        for (int aa : a) {
            ans.next = new ListNode(aa);
            ans = ans.next;
        }
        return x.next;
    }
    // 1 2 3 4 5 6 7
    //       i     cnt
    // i=3    cnt=6
    private void swap(List<Integer> a, int start, int end) {
        while (start < end) {
            int tmp = a.get(start); // 值
            a.set(start, a.get(end));
            a.set(end, tmp);
            start ++;
            end --;
        }
    }
}
// @lc code=end

