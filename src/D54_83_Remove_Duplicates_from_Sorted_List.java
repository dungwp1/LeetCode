public class D54_83_Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curN = head;
        while (curN != null && curN.next != null) {
            if (curN.next.val == curN.val) {
                curN.next = curN.next.next;
            } else {
                curN = curN.next;
            }
        }
        return head;
    }
}
/**
 * Solution:
 * Duyệt từng node, bắt đầu từ head
 * Nếu value của node hiện tại = value của node next => chuyển con trỏ của node hiện tại đến node next phía sau.
 * Nếu value của node hiện tại != value của node next => duyệt đến node tiếp theo và lặp lại bước trên.
 * Duyệt đến khi node hiện tại == null thì dừng
 */