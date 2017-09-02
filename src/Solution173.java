public class Solution173 {
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);

        while (head != null) {
            ListNode point = dummy;
            while (point.next != null && head.val > point.next.val) {
                point = point.next;
            }
            ListNode temp = head.next;
            head.next = point.next;
            point.next = head;
            head = temp;
        }

        return dummy.next;
    }
}