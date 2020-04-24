import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListUtilTest {
    @Test
    public void testPrint() {
        ListNode head = LinkedListUtil.makeSampleLinkedList();
        String res = LinkedListUtil.print(head);
        assertEquals("[1,2,3,4,5]", res);
    }
}