package myscala.programs.dsa.programs;

import java.util.Arrays;

/**
 * @author Santosh Buganna Ganapa (sganapa2)
 * Written on 7/4/2022 10:27 PM
 *
 * Program to sort an array with only 0s, 1s and 2s without using sort method
 */
public class SortArrayWirhZerosOnesTwosValues {

    public static void main(String[] args) {

        Integer []inputArray = {0,1,1,0,2,1,0,2,2,1,0};
        System.out.println("Input array is: " + Arrays.toString(inputArray));

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for (Integer integer : inputArray) {
            if (integer == 0) {
                zeroCount++;
            } else if (integer == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        int counter;
        for(counter=0; counter<zeroCount;counter++) {
            inputArray[counter]=0;
        }
        for(int i=0; i<oneCount; i++) {
            inputArray[counter]=1;
            counter++;
        }
        for(int i=0;i<twoCount;i++) {
            inputArray[counter]=2;
            counter++;
        }

        System.out.println("Final sorted array is: " + Arrays.toString(inputArray));
    }
}
