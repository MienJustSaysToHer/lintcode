public class Solution451 {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        head = dummy;
        while (head.next != null && head.next.next != null) {
            ListNode point1 = head.next;
            ListNode point2 = head.next.next;

            head.next = point2;
            point1.next = point2.next;
            point2.next = point1;
            head = point1;
        }

        return dummy.next;
    }
}