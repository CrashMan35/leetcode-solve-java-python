package model;

import java.util.LinkedList;
import java.util.Queue;

public class MyStackWithOneQueue {
    private Queue<Integer> queue;

    public MyStackWithOneQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        while (size --> 1) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyStackWithOneQueue myStack = new MyStackWithOneQueue();
        myStack.push(1);
        myStack.push(2);
        myStack.top(); // 返回 2
        myStack.pop(); // 返回 2
        myStack.empty(); // 返回 False

    }
}
