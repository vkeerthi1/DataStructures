package com.ds.LinkedList;

public class LLMiddle {

    /* Driver code*/
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        for (int i=5; i>0; --i)
        {
            llist.push(i);
            llist.printList();
            printMiddle(llist.head);
        }


    }

    private static void printMiddle(LinkedList.Node head) {
         LinkedList.Node slow = head;
         LinkedList.Node fast = head;

         while(fast !=null && fast.next!=null){
             fast = fast.next.next;
             slow = slow.next;
         }
        System.out.println("The middle element is [" +
                slow.data + "] \n");
    }


}
