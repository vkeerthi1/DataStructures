package com.ds.LinkedList;

public class LLSwapNodes {

    /* Driver program to test above function */
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print(
                "\n Linked list before calling swapNodes() ");
        llist.printList();

        swapNodes(4, 3, llist);

        System.out.print(
                "\n Linked list after calling swapNodes() ");
        llist.printList();
    }

    private static void swapNodes(int x, int y, LinkedList llist) {
        if (x == y)
            return;

        LinkedList.Node prevX = null, currX = llist.head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        LinkedList.Node prevY = null, currY = llist.head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        if(prevX != null)
            prevX.next = currY;
        else
            llist.head=currY;

        if(prevY != null)
            prevY.next = currX;
        else
            llist.head=currX;

        LinkedList.Node temp = currX.next;
        currX.next = currY.next;
        currY.next=temp;

    }
}
