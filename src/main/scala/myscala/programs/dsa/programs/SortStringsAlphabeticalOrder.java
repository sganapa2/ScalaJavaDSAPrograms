package myscala.programs.dsa.programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Santosh Buganna Ganapa (sganapa2)
 * Written on 7/6/2022 6:52 PM
 * Task: Sort a list of Strings in alphabetical order.
 */
public class SortStringsAlphabeticalOrder {

    public static void main(String[] args) {

        List<String> inputList = new ArrayList<>();
        inputList.add("Santosh");
        inputList.add("Ganapa");
        inputList.add("Mama");
        inputList.add("Vyankatesh");
        inputList.add("Govinda");
        inputList.add("Amma");
        System.out.println("Before sorting in alphabetical order, list is: " + inputList);
        sortStringsAlpha(inputList);
        System.out.println("After sorting in alphabetical order, list is: " + inputList);
    }

    public static List<String> sortStringsAlpha(List<String> inputList) {
        inputList.sort(String::compareToIgnoreCase);
        return inputList;
    }
}
