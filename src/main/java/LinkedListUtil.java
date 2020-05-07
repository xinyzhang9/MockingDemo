import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class LinkedListUtil {
    private LinkedListUtil() {}
    public static String print(ListNode node) {
        ListNode dummy = new ListNode(-1);
        dummy.next = node;
        ListNode cur = dummy.next;
        List<String> list = new ArrayList<String>();
        while(cur != null) {
            list.add(String.valueOf(cur.val));
            cur = cur.next;
        }
        
        String[] arr = new String[list.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return "[" + StringUtils.join(arr,",") + "]";

    }

    public static ListNode makeSampleLinkedList(int n) {
        ListNode head = new ListNode(1);
        if(n == 1) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        for(int i = 2; i <=n; i++) {
            head.next = new ListNode(i);
            head = head.next;
        }
        return dummy.next;
    }

    public static ListNode makeLinkedListFromArray(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for(int val:arr) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;
    }
}