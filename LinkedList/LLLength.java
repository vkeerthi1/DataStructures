package com.ds.LinkedList;

public class LLLength {
    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);

        System.out.println("Count of nodes is " +
                getCount(llist));
        System.out.println("Count of nodes is " +
                getCountWithRec(llist));
    }

    public static int getCount(LinkedList llist) {
        LinkedList.Node temp = llist.head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static int getCountRec(LinkedList.Node node) {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }

    public static int getCountWithRec(LinkedList llist)
    {
        return getCountRec(llist.head);
    }
}
