package Q008;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FixedStack fixedStack = new FixedStack();
        DynamicStack dynamicStack = new DynamicStack();
        fixedStack.push(10);
        fixedStack.push(20);
        // fixedStack.push(30); // Stack Overflow
        System.out.println(fixedStack.pop());
        System.out.println(fixedStack.pop());
        // System.out.println(fixedStack.pop()); // Stack Underflow
        dynamicStack.push(10);
        dynamicStack.push(20);
        dynamicStack.push(30);
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        // System.out.println(dynamicStack.pop()); // Stack Underflow
    }
}

interface Stack {
    void push(int x);

    int pop();
}

class FixedStack implements Stack {
    private int stackSize = 2;
    private int[] stack = new int[this.stackSize];
    private int top = -1;

    @Override
    public void push(int x) {
        if (this.top + 1 == stackSize) {
            System.out.println("Stack Overflow");
            return;
        }
        this.stack[++top] = x;
    }

    @Override
    public int pop() {
        if (this.top == -1) {
            System.out.println(this.top);
            System.out.println("Stack Underflow");
            return -1;
        }
        return this.stack[top--];
    }
}

class DynamicStack implements Stack {
    private int stackSize = 1;
    private int[] stack = new int[this.stackSize];
    private int top = -1;

    private void increaseStackSize() {
        this.stackSize++;
        this.stack = Arrays.copyOf(this.stack, this.stackSize);
    }

    @Override
    public void push(int x) {
        if (this.top + 1 == stackSize) {
            increaseStackSize();
        }
        this.stack[++top] = x;
    }

    @Override
    public int pop() {
        if (this.top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return this.stack[top--];
    }
}