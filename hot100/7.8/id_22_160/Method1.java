class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Method1 {
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
