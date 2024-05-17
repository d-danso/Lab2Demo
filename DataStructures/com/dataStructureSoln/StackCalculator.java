package com.dataStructureSoln;

public class StackCalculator {
    private int[] stack;
    private int top;
    private int maxSize;

    public StackCalculator(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public void add() {
        int a = pop();
        int b = pop();
        push(a + b);
    }

    public void subtract() {
        int a = pop();
        int b = pop();
        push(b - a);
    }

    public void multiply() {
        int a = pop();
        int b = pop();
        push(a * b);
    }

    public void divide() {
        int a = pop();
        int b = pop();
        if (a == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        push(b / a);
    }

    public static void main(String[] args) {
        StackCalculator sc = new StackCalculator(10);
        sc.push(10);
        sc.push(20);
//        sc.add();
//        sc.multiply();
//        sc.divide();
        sc.subtract();

        System.out.println(sc.pop());
    }
}
