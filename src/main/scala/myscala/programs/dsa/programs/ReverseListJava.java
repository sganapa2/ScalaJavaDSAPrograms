package myscala.programs.dsa.programs;

import java.util.Arrays;


public class ReverseListJava {
    public static void main(String[] args) {

        int[] inputList = new int[]{1,2,3,4,5,6};
        //int[] inputList = new int[]{1,2,3};
        //int[] inputList = new int[]{1};
        System.out.println("BEFORE REVERSE" + Arrays.toString(inputList));
        revresedList(inputList);
        System.out.println("AFTER REVERSE" + Arrays.toString(inputList));
    }

    public static void revresedList(int[] inputList) {
        int start=0;
        int end = inputList.length-1;
        while (start<=end) {
            int temp = inputList[start];
            inputList[start] = inputList[end];
            inputList[end]=temp;
            start++;
            end--;
        }
    }
}
