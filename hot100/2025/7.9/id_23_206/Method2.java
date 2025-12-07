class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}

// 递归
public class Method2 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        return recur(cur, pre);
    }
    public ListNode recur(ListNode cur, ListNode pre) {
        // 边界条件
        if (cur == null) {
            return pre;
        }
        // cur = 5, pre = 4
        ListNode res = recur(cur.next, cur); // res = 5
        cur.next = pre;
        return res;
    }
    
    public static void main(String[] args) {
        // 创建链表 [1,2,3,4,5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // 打印原始链表
        System.out.println("原始链表:");
        printList(head);
        
        // 反转链表
        Method2 solution = new Method2();
        ListNode reversed = solution.reverseList(head);
        
        // 打印反转后的链表
        System.out.println("反转后的链表:");
        printList(reversed);
    }
    
    // 打印链表的辅助方法
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}