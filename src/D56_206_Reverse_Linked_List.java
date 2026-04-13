public class D56_206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode preN = null;
        ListNode curN = head;
        while (curN != null) {
            ListNode nextN = curN.next;
            curN.next = preN;
            preN = curN;
            curN = nextN;
        }
        return preN;
    }
}
