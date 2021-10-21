package com.ds.Stack;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();

    static Stack<Integer> s3 = new Stack<Integer>();
    static Stack<Integer> s4 = new Stack<Integer>();

    static void enQueue(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // Push item into s1
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    static int deQueue() {
        // if first stack is empty
        if (s1.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        // Return top of s1
        int x = s1.peek();
        s1.pop();
        return x;
    }

    public static void main(String args[]) {
                /*    Complexity Analysis:

    Time Complexity:
    Push operation: O(N).
    In the worst case we have empty whole of stack 1 into stack 2.
    Pop operation: O(1).
    Same as pop operation in stack.
    Auxiliary Space: O(N).
    Use of stack for storing values.*/
        QueueUsingStack q = new QueueUsingStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());



        // Method 2 (By making deQueue operation costly)In this method, in en-queue operation,
        // the new element is entered at the top of stack1. In de-queue operation,
        // if stack2 is empty then all the elements are moved to stack2 and finally top of stack2 is returned.
    }
}
