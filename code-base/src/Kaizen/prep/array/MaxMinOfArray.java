package Kaizen.prep.array;

/*
*
* Maximum and minimum of an array using minimum number of comparisons
*
*
* */

public class MaxMinOfArray {

    static class Result {
        int max;
        int min;
    }

    Result getMinMaxOfArray(int[] input){
        Result res = new Result();
        if (input.length == 0) {
            return null;
        }
        res.max = res.min = input[0];
        for (int i = 1; i < input.length; i++) {
            if(input[i]< res.min) {
                res.min = input[i];
                continue;
            }
            if(input[i] > res.max) {
                res.max = input[i];
                continue;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr1[] = {1000, 11, 445, 1, 330, 3000};
        int arr2[] = {};
        int arr3[] = {1,1,1,1,1,0};
        MaxMinOfArray ma = new MaxMinOfArray();
        Result res[] = { ma.getMinMaxOfArray(arr1), ma.getMinMaxOfArray(arr2), ma.getMinMaxOfArray(arr3)};

        for (Result r: res) {
            if (r != null) {
                System.out.println("max  " + r.max + " min  " + r.min);
            } else {
                System.out.println("null");
            }
        }
    }

}
