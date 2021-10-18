package com.ds.LinkedList;

public class LLNthNode {

    /* Driver code*/
    public static void main(String[] args) {
        /* Start with empty list */
        LinkedList llist = new LinkedList();

        /* Use push() to construct below list
           1->12->1->4->1  */
        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);

        /* Check the count function */
        System.out.println("Element at index 3 is "
                + GetNth(llist, 3));
        System.out.printf("Element at index 3 is %d",
                GetNthRec(llist.head, 3));
    }

    //Time Complexity: O(n)
    private static int GetNth(LinkedList llist, int i) {
        LinkedList.Node current = llist.head;
        int count = 0;

        while (current != null) {
            if (count == i) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return 0;
    }

    //Time Complexity: O(n)
    private static int GetNthRec(LinkedList.Node head, int i) {
        int count = 0;
        if (head == null) {
            return -1;
        }
        if (count == i) {
            return head.data;
        }
        return GetNthRec(head.next, i - 1);
    }
}
