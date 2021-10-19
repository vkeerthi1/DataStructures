package com.ds.array;

public class RotateArray {

    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
        System.out.print("\n");
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotateRev(arr1, 2);
        rotate.printArray(arr1, 7);
    }

    static void leftRotateRev(int arr[], int d) {
        if (d == 0)
            return;

        int n = arr.length;
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }





    //Time Complexity : O(n)
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    private void leftRotate(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    //Time complexity : O(n * d)
    //Auxiliary Space : O(1)
    private void leftRotatebyOne(int[] arr, int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }

    /*Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
    A = [1, 2] and B = [3, 4, 5, 6, 7]


    Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
    Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
    Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]*/
}
