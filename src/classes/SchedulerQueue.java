package src.classes;
import java.util.LinkedList;

public class SchedulerQueue {
    private LinkedList<Integer> queue;

    public SchedulerQueue() {
        queue = new LinkedList<>();
    }

    public void add(int element) {
        queue.addLast(element);
    }

    public int remove() {
        return queue.removeFirst();
    }

    public int removeLast() {
        return queue.removeLast();
    }

    public int getFront() {
        return queue.peekFirst();
    }

    public int getEnd() {
        return queue.peekLast();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}