package myscala.programs.dsa.programs;

import java.util.Arrays;
import java.util.*;

public class KthLargestKthSmallestNumber {

    public static void main(String[] args) {

        Integer []inputArray = {20,50,10,90,30};
        //Integer []inputArray = {20,50,10};

        int kthSmallest = 2;
        int kthLargest = 3;

        System.out.println("Input array is: " + Arrays.toString(inputArray));
        System.out.println(kthLargest + " largest number in the list is: " + getNthLargestNumber(inputArray, kthLargest));
        System.out.println(kthSmallest + " smallest number in the list is: " + getNthSmallestNumber(inputArray, kthSmallest));
    }

    /**
     * Sort input array in ascending order and pick the kth element
     * For example: For given inputArray = {20,50,10,90,30}
     * After sort in ascending order inputArray = {10,20,30,50,90}
     * Hence for k=2, second smallest number in array is 20.
     * @param inputArray
     * @param kthSmallest
     * @return
     */
    private static int getNthSmallestNumber(Integer[] inputArray, int kthSmallest) {
        Arrays.sort(inputArray);
        return inputArray[kthSmallest-1];
    }


    /**
     * Sort input array in descending order and pick the kth element
     * For example: For given inputArray = {20,50,10,90,30}
     * After sort in descending order inputArray = {90,50,30,20,10}
     * Hence for k=3, third largest number in array is 30.
     * @param inputArray
     * @param kthLargest
     * @return
     */
    private static int getNthLargestNumber(Integer[] inputArray, int kthLargest) {
        Arrays.sort(inputArray, Collections.reverseOrder());
        return inputArray[kthLargest-1];
    }
}
