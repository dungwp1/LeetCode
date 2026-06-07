public class D68_147_Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next; // lưu node next
            ListNode prev = dummy;
//            Tìm vị trí có prev.next.val > current.val
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = current;
            current = next;
        }
        return dummy.next;
    }
}
