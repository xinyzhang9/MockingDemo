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

    @Test
    public void reveseListTest() {
        ListNode head = LinkedListUtil.makeSampleLinkedList(5);
        ListNode res = solution.reverseList(head);
        assertEquals("[5,4,3,2,1]", LinkedListUtil.print(res));

    }

    @Test
    public void isPalindrome_new_space_test() {
        ListNode head = LinkedListUtil.makeLinkedListFromArray(new int[]{1,2,2,1});
        System.out.println(LinkedListUtil.print(head));
        Boolean res = solution.isPalindrome_new_space_solution(head);
        assertEquals(true, res);
    }

    @Test
    public void isPalindrome_half_compare_test() {
        ListNode head = LinkedListUtil.makeLinkedListFromArray(new int[]{1,2,2,1});
        System.out.println(LinkedListUtil.print(head));
        Boolean res = solution.isPalindrome_half_comparare_solution(head);
        assertEquals(true, res);
    }

    @Test
    public void isPalindrome_half_compare_test2() {
        ListNode head = LinkedListUtil.makeLinkedListFromArray(new int[]{1,2,3,2,1});
        System.out.println(LinkedListUtil.print(head));
        Boolean res = solution.isPalindrome_half_comparare_solution(head);
        assertEquals(true, res);
    }

    @Test
    public void isPalindrome_half_compare_test3() {
        ListNode head = LinkedListUtil.makeLinkedListFromArray(new int[]{1,2,3,1,2,1});
        System.out.println(LinkedListUtil.print(head));
        Boolean res = solution.isPalindrome_half_comparare_solution(head);
        assertEquals(false, res);
    }

    @Test
    public void isPalindrome_recursive_test() {
        ListNode head = LinkedListUtil.makeLinkedListFromArray(new int[]{1,2,2,1});
        System.out.println(LinkedListUtil.print(head));
        Boolean res = solution.isPalindrome_recursive(head);
        assertEquals(true, res);
    }

    @Test
    public void isPalindrome_recursive_test2() {
        ListNode head = LinkedListUtil.makeLinkedListFromArray(new int[]{1,2,3,2,1});
        System.out.println(LinkedListUtil.print(head));
        Boolean res = solution.isPalindrome_recursive(head);
        assertEquals(true, res);
    }


}