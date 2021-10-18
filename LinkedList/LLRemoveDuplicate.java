package com.ds.LinkedList;

import java.util.HashSet;

public class LLRemoveDuplicate {


    /* Driver program to test above function */
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.println("List before removal of duplicates");
        printList(llist);

        removeDuplicates(llist);

        System.out.println("List after removal of elements");
        printList(llist);


    }

    private static void removeDuplicates(LinkedList llist) {
      //1
/*        LinkedList.Node curr = llist.head;

      while(curr!=null){
          LinkedList.Node temp = curr;

          while(temp!=null && temp.data == curr.data){
              temp = temp.next;
          }
          *//*Set current node next to the next different
            element denoted by temp*//*
          curr.next = temp;
          curr = curr.next;
      }*/
      //2
        HashSet<Integer> hs = new HashSet<>();
        LinkedList.Node current = llist.head;
        LinkedList.Node prev = null;

        while(current!=null){
            int currval = current.data;
            if(hs.contains(currval))
            {
                prev.next=current.next;
            }
            else{
                hs.add(currval);
                prev = current;
            }
            current = current.next;
        }

    }

    static void printList(LinkedList llist)
    {
        LinkedList.Node temp = llist.head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
