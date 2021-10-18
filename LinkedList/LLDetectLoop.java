package com.ds.LinkedList;

import java.util.HashSet;

public class LLDetectLoop {


    /* Driver program to test above function */
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (detectLoop(llist.head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

        if (detectLoopFloydCycle(llist.head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }

    /*Complexity Analysis:

    Time complexity: O(n).
    Only one traversal of the loop is needed.
    Auxiliary Space: O(n).
    n is the space required to store the value in hashmap.*/
    static boolean detectLoop(LinkedList.Node h) {
        HashSet<LinkedList.Node> s = new HashSet<LinkedList.Node>();
        while (h != null) {
            if (s.contains(h)) {
                return true;
            }
            s.add(h);
            h = h.next;
        }
        return false;
    }

/*    Complexity Analysis:

    Time complexity: O(n).
    Only one traversal of the loop is needed.
    Auxiliary Space:O(1).
    There is no space required.*/
    static boolean detectLoopFloydCycle(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while (slow != null && fast != null
                && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                countNodes(slow);
                return true;
            }

        }
        return false;

    }

/*    Complexity Analysis:

    Time complexity:O(n).
    Only one traversal of the linked list is needed.
    Auxiliary Space:O(1).
    As no extra space is required.*/
    private static int countNodes(LinkedList.Node slow) {
        int res=1;
        LinkedList.Node temp = slow;
        while(temp.next != slow){
              res++;
              temp = temp.next;
        }
        System.out.println(res);
        return res;
    }
}
