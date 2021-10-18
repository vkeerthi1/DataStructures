package com.ds.LinkedList;

public class LLNthNodeFromLast {

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
        printNthFromLast(llist, 4);
        printNthLast(llist.head, 6);
    }

    //Time Complexity: O(n)
    private static void printNthFromLast(LinkedList llist, int n) {
        int len = 0;
        LinkedList.Node temp = llist.head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < n)
            return;

        temp = llist.head;
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }

    private static void printNthLast(LinkedList.Node head, int n) {
        int i = 0;
        if (head == null) {
            return;
        }
        printNthLast(head.next,n);
        if(++i == n){
           System.out.print(head.data);
        }
    }
}
