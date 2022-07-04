package myscala.programs.dsa.programs;

import java.util.ArrayList;
import java.util.List;

public class MinMaxValueJava {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        for(int i=1;i<10;i++) {
            intList.add(i);
        }

        int minValue =0;
        int maxValue=0;

        for(int i=0;i<intList.size();i++) {
           // minValue
            if(i==0) {
                minValue = intList.get(i);
                maxValue = intList.get(i);
            }
            if(minValue>intList.get(i)) {
                minValue=intList.get(i);
            }
            if(intList.get(i)>maxValue) {
                maxValue=intList.get(i);
            }
        }

        System.out.println("Min value is: " + minValue + " Max value is: " + maxValue);
    }
}
