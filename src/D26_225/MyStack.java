package D26_225;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    private final Queue<Integer> queue1;
    private final Queue<Integer> queue2;

    public MyStack() {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }

    public void push(int x) {
        Queue<Integer> active = queue1.isEmpty() ? queue2 : queue1;
        Queue<Integer> empty = queue1.isEmpty() ? queue1 : queue2;
        empty.add(x);
        while (!active.isEmpty()) {
            empty.add(active.remove());
        }
    }

    public int pop() {
        return queue1.isEmpty() ? queue2.remove() : queue1.remove();
    }

    public int top() {
        return queue1.isEmpty() ? queue2.element() : queue1.element();

    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
