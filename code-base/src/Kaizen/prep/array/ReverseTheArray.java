package Kaizen.prep.array;


/*
* Write a program to reverse an array or string
*
* Input  : arr[] = {1, 2, 3}
* Output : arr[] = {3, 2, 1}
*
* Input :  arr[] = {4, 5, 1, 2}
* Output : arr[] = {2, 1, 5, 4}
*
* */

import Kaizen.prep.utils.Utils;

public class ReverseTheArray {

    int[] reverseArray(int[] input) {
        if (input.length == 0) {
            return input;
        }
        int maxLength = input.length - 1;
        int halfLength = maxLength / 2;
        for (int i = 0; i <= halfLength; i++) {
            int temp = input[i];
            input[i] = input[maxLength - i];
            input[maxLength - i] = temp;
        }

        return input;
    }

    //  Driver code
    public static void main(String[] args) {
        ReverseTheArray ra = new ReverseTheArray();
        int[] test1 = ra.reverseArray(new int[]{1, 2, 3});
        int[] test2 = ra.reverseArray(new int[]{4, 5, 1, 2});
        int[] test3 = ra.reverseArray(new int[]{});
        int[] test4 = ra.reverseArray(new int[]{1,2,3,4,5,6,7,8,9});
        Utils.printArray(test1);
        Utils.printArray(test2);
        Utils.printArray(test3);
        Utils.printArray(test4);
    }
}
