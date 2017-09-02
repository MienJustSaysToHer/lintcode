public class Solution166 {
    /**
     * @param head: The first node of linked list.
     * @param n:    An integer.
     * @return: Nth to last node of a singly linked list.
     */
    ListNode nthToLast(ListNode head, int n) {
        if (head == null || n < 1) {
            return null;
        }

        ListNode point1 = head;
        ListNode point2 = head;

        for (int j = 0; j < n; j++) {
            if (point1 == null) {
                return null;
            }
            point1 = point1.next;
        }

        while (point1 != null) {
            point1 = point1.next;
            point2 = point2.next;
        }

        return point2;
    }
}