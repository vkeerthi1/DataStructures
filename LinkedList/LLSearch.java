package com.ds.LinkedList;

public class LLSearch {

    //Driver function to test the above functions
    public static void main(String args[]) {

        //Start with the empty list
        LinkedList llist = new LinkedList();

        /*Use push() to construct below list
        14->21->11->30->10  */
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);

        if (search(llist.head, 21))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (searchRec(llist.head, 22))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean searchRec(LinkedList.Node head, int i) {
          if(head == null){
              return false;
          }
          if(head.data ==i)
              return true;

          return searchRec(head.next,i);
    }

    private static boolean search(LinkedList.Node head, int i) {
        LinkedList.Node current = head;
        while (current != null) {
            if (current.data == i)
                return true;
            current = current.next;
        }
        return false;

    }
}
