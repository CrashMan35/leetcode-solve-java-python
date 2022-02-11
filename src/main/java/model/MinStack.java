package model;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;
    private int min;
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        dataStack.push(val);
        int miner = Math.min(this.min, val);
        min = miner;
        minStack.push(miner);
    }

    public void pop() {
        minStack.pop();
        min = minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return min;
    }
}
