public class Solution452 {
    /**
     * @param head a ListNode
     * @param val  an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        head = listNode;
        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return listNode.next;
    }
}