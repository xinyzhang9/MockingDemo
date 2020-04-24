
public class LinkedListSolution {
    public ListNode removeNthNodeFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        int len = 0;
        while(cur != null) {
            len++;
            cur = cur.next;
        }
        len-=n;
        cur = dummy;
        while(len > 0) {
            cur = cur.next;
            len--;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }

    public ListNode removeNthNodeFromEnd_1pass(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for(int i = 0; i <= n; i++) {
            second = second.next;
        }
        while(second != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}