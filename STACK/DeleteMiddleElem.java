package com.ds.Stack;

import java.util.Stack;

public class DeleteMiddleElem {

    // Driver function to test above functions
    public static void main(String args[]) {
        Stack<Character> st =
                new Stack<Character>();

        // push elements into the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');

        deleteMid(st, st.size(), 0);

        // Printing stack after deletion
        // of middle.
        while (!st.empty()) {
            char p = st.pop();
            System.out.print(p + " ");
        }
    }

    private static void deleteMid(Stack<Character> st, int n, int curr) {

        // If stack is empty or all items
        // are traversed
        if (st.empty() || curr == n)
            return;

        // Remove current item
        char x = st.pop();

        deleteMid(st, n, curr+1);
        // Put all items back except middle
        if (curr != n/2)
            st.push(x);
    }
}
