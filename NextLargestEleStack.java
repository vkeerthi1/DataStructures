package com.ds.Stack;

import java.util.Stack;

public class NextLargestEleStack {
    // Driver Code
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,1,8};
        printNextlargerEle(arr);


    }

    private static void printNextlargerEle(int[] arr) {
        if(arr.length == 0){
            return;
        }
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for (int i = 0; i < arr.length ; i++) {
            while(!s.isEmpty() && arr[i] > s.peek()){
                s.pop();
                System.out.println(arr[i]);
            }
            s.push(arr[i]);
        }
        while (!s.isEmpty()){
            System.out.println(-1);
            s.pop();
        }
    }


}
