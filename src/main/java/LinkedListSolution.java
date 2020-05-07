import java.util.ArrayDeque;
import java.util.Deque;

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

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }

    public Boolean isPalindrome_new_space_solution(ListNode head) {
        ListNode cur = head;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        while(cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        while(cur != null) {
            int val = stack.pop();
            if(cur.val != val) return false;
            cur = cur.next;
        }
        return true;
    }

    public Boolean isPalindrome_half_comparare_solution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHead = slow.next;
        slow.next = null;

        // reverse second half
        ListNode cur = secondHead;
        ListNode prev = null;
        while(cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }

        // compare two list
        ListNode newHead = prev;
        cur = head;
        ListNode cur2 = newHead;
        while(cur != null && cur2 != null) {
            if(cur.val != cur2.val) return false;
            cur = cur.next;
            cur2 = cur2.next;
        }
        return true;

    }

    ListNode left;
    public boolean isPalindrome_recursive(ListNode head) {
        left = head;
        return helper(head);
    } 

    private boolean helper(ListNode right) {
        if(right == null) return true;
        boolean x = helper(right.next);
        if(!x) return false;
        boolean y = (left.val == right.val);
        left = left.next;
        return y;
    }

    
}