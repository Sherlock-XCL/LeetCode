class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Method2 {
    public boolean hasCycle(ListNode head) {
        // 快慢指针 - 龟兔赛跑
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null) {
                return false;
            }
            slow = slow.next;
            if (fast.next == null) return false;
            fast = fast.next.next;
        }
        return true;
    }
}
