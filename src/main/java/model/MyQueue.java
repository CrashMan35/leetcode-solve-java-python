package model;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> addStack;
    private Stack<Integer> getStack;
    private int length;

    public MyQueue() {
        addStack = new Stack();
        getStack = new Stack();
    }

    public void push(int x) {
        addStack.push(x);
        length++;
    }

    public int pop() {
        if (!getStack.isEmpty()) {
            length--;
            return getStack.pop();
        }
        if (!addStack.isEmpty()) {
            while (!addStack.isEmpty()) {
                getStack.push(addStack.pop());
            }
            length--;
            return getStack.pop();
        }
        return -999;
    }

    public int peek() {
        if (!getStack.isEmpty()) {
            return getStack.peek();
        }
        if (!addStack.isEmpty()) {
            while (!addStack.isEmpty()) {
                getStack.push(addStack.pop());
            }
            return getStack.peek();
        }
        return -999;
    }

    public boolean empty() {
        return length == 0;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek());; // return 1
        System.out.println(myQueue.pop());; // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
    }
}
