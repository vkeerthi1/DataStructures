package com.ds.array;

import java.util.Arrays;

public class KSmallestlagert {
    public static int kthSmallest(Integer[] arr,
                                  int k)
    {
        // Sort the given array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }
    // driver program
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 2;
        //Time Complexity of this solution is O(N Log N)
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
        //largest 3
        print3largest(arr, arr.length);
        //An efficient way to solve this problem is to use any O(nLogn) sorting algorithm & simply returning the last 3 largest elements.
        find3largest(arr);
    }
   static void find3largest(Integer[] arr)
    {
        Arrays.sort(arr); // It uses Tuned Quicksort with
        // avg. case Time complexity = O(nLogn)
        int n = arr.length;
        int check = 0, count = 1;
        for (int i = 1; i <= n; i++) {

            if (count < 4) {
                if (check != arr[n - i]) {
                    // to handle duplicate values
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            }
            else
                break;
        }


    }
    static void print3largest(Integer[] arr, int arr_size)
    {
        int i, first, second, third;

        /* There should be atleast three elements */
        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if(arr[i] > first){
                third = second;
                second = first;
                first =arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println("\nThree largest elements are " + first + " " + second + " " + third);
    }
}
