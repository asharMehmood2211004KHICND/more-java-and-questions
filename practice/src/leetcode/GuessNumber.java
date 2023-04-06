package leetcode;

import java.util.Arrays;

public class GuessNumber {
    public static void main(String[] args) {

        guessNumber(6);
    }

    static void guessNumber(int n) {

        int[] arr = {};

        for(int i = 1; i<arr.length;i++){
            arr[i-1] = i;
        }
        arr[n-1] = n;
//        System.out.println(Arrays.toString(arr) );


        int start = arr[0];
        int end = arr[arr.length-1];





    }
}

