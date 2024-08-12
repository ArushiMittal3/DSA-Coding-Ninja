package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsing2Queues() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    public void push(int ele) {
        q1.add(ele);
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Leave one element in q1 and push others to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Pop the only left element from q1
        int ele = q1.remove();

        // Swap the names of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return ele;
    }

    public static void main(String[] args) {
        StackUsing2Queues stack = new StackUsing2Queues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // should print 3
        System.out.println(stack.pop()); // should print 2
        System.out.println(stack.pop()); // should print 1
    }
}
