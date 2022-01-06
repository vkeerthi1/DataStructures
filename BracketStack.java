package com.ds.Stack;

import java.util.Stack;

public class BracketStack {
    // Driver Code
    public static void main(String[] args) {
        String st = "a[b+{c*(u-r)}]";

        System.out.println("Original Stack");

        System.out.println(st);

        System.out.println(checkCorrectBracket(st));
        String d = "a[b+{c*((u-r)}]";
        System.out.println(checkCorrectBracket(d));

    }

    private static boolean checkCorrectBracket(String st) {
        Stack<Character> sta = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    sta.push(c);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!st.isEmpty()) {
                        char ch = sta.pop();
                        if (ch == '{' && c != '}' ||
                                ch == '[' && c != ']' ||
                                ch == '(' && c != ')') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
            }
        }

        if (!sta.isEmpty()) {
            return false;
        }
        return true;
    }
}
