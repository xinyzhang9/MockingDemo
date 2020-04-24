import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListSolutionTest {
    private LinkedListSolution solution = new LinkedListSolution();
    @Test
    public void removeNthNodeFromEnd() {
        ListNode head = LinkedListUtil.makeSampleLinkedList(5);
        ListNode res = solution.removeNthNodeFromEnd(head, 2);
        assertEquals("[1,2,3,5]", LinkedListUtil.print(res));
    }

    @Test
    public void removeNthNodeFromEnd_1pass() {
        ListNode head = LinkedListUtil.makeSampleLinkedList(5);
        ListNode res = solution.removeNthNodeFromEnd_1pass(head, 2);
        assertEquals("[1,2,3,5]", LinkedListUtil.print(res));
    }

    @Test
    public void removeNthNodeFromEnd_1pass_oneNode() {
        ListNode head = LinkedListUtil.makeSampleLinkedList(1);
        ListNode res = solution.removeNthNodeFromEnd_1pass(head, 1);
        assertEquals("[]", LinkedListUtil.print(res));
    }
}