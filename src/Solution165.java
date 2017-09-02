public class Solution165 {
    /**
     * @param l1 l1 is the head of the linked list
     * @param l2 l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode point = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                point.next = l1;
                l1 = l1.next;
            } else {
                point.next = l2;
                l2 = l2.next;
            }
            point = point.next;
        }

        if (l1 != null) {
            point.next = l1;
        } else {
            point.next = l2;
        }

        return dummy.next;
    }
}