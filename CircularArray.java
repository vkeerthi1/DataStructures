package com.ds.array;

public class CircularArray {

    public static void main(String[] args) {
        //int[] arr = {1, 1, 2, 1, 2}; //true
        int[] arr = {4, 1, 1, 1}; //false
        System.out.print(CircularArray.checkifCircular(arr));
    }

    private static boolean checkifCircular(int[] arr) {
        if (arr.length <= 1) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int slow = i, fast = i;
            boolean ifForward = arr[i] > 0;
            while (true) {
                slow = getNextPos(arr, slow, ifForward);
                if (slow == -1) {
                    break;
                }

                fast = getNextPos(arr, fast, ifForward);
                if (fast == -1) {
                    break;
                }

                fast = getNextPos(arr, fast, ifForward);
                if (fast == -1) {
                    break;
                }
                if (slow == fast) {
                    return true;
                }
            }

        }

        return false;
    }

    private static int getNextPos(int[] arr, int index, boolean ifForward) {
        boolean direction = arr[index] >= 0;
        if (direction != ifForward) {
            return -1;
        }
        int nextIndex = (index + arr[index]) % arr.length;
        if (nextIndex < 0) {
            nextIndex = nextIndex + arr.length; //-2,-1,1,-2,-1
        }
        if (nextIndex == index) { //4,1,1,1
            return -1;
        }
        return nextIndex;
    }
}
