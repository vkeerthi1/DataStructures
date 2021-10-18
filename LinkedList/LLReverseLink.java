package com.ds.LinkedList;

import java.util.Stack;

import static com.ds.LinkedList.LLRemoveDuplicate.printList;

public class LLReverseLink {

    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);

        System.out.println("Given Linked list");
        printList(llist);
        llist.head = reverse(llist.head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        printList(llist);
        llist.head = reverseAll(llist.head);
        System.out.println("Reversed linked list ");
        printList(llist);
    }

    private static LinkedList.Node reverseAll(LinkedList.Node node) {
        Stack<LinkedList.Node> s = new Stack<>();
        LinkedList.Node temp = node;
        while(temp.next != null){
            s.add(temp);
            temp = temp.next;
        }
        node = temp;

        while(!s.empty()){
            // Store the top value of
            // stack in list
            temp.next = s.peek();

            // Pop the value from stack
            s.pop();

            // update the next pointer in the
            // in the list
            temp = temp.next;
        }
        temp.next = null;
        return node;
    }
    private static LinkedList.Node reverse(LinkedList.Node node) {
        LinkedList.Node prev = null;
        LinkedList.Node current = node;
        LinkedList.Node next = null;

        while(current!= null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;

    }
   // Time Complexity: O(n)
   // Space Complexity: O(1)

}
