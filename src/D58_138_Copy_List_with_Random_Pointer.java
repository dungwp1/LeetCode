import java.util.HashMap;
import java.util.Map;

public class D58_138_Copy_List_with_Random_Pointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node oldNode = head;
        while (oldNode != null) {
            Node newNode = new Node(oldNode.val);
            map.put(oldNode, newNode);
            oldNode = oldNode.next;
        }
        oldNode = head;
        while (oldNode != null) {
            map.get(oldNode).next = (oldNode.next != null) ? map.get(oldNode.next) : null;
            map.get(oldNode).random = (oldNode.random != null) ? map.get(oldNode.random) : null;

            oldNode = oldNode.next;
        }
        return map.get(head);
    }
}


/**
 * Yêu cầu: Copy Linked List từ List gốc, phải tạo Node mới, và các con trỏ next và random cũng phải trỏ đến Node mới tương ứng.
 * Solution: Với mỗi Node gốc -> Tạo newNode có value = node gốc
 * Lưu vào HashMap với cặp key-value: oldNode - newNode
 * Các trỏ next và random:
 * - newNode.next = newNode1 (ví dụ)
 * - newNode1 chính là value của key oldNode1 (chính là oldNode.next)
 * -> newNode.next = map.get(oldNode1)
 * -> newNode.next = map.get(oldNode.next)
 */
