public class Solution174 {
    /**
     * @param head: The first node of linked list.
     * @param n:    An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preDel = dummy;

        for (int j = 0; j < n; j++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            preDel = preDel.next;
        }

        preDel.next = preDel.next.next;
        return dummy.next;
    }
}