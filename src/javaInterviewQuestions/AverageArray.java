package javaInterviewQuestions;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {
    //How to find average of array? - using simple loop.


    public static void main(String[] args) {

        int num[]={2,4,5,1,9,4,23,11,7,8};


        int total=0;
        for(int e: num){
            total=total+e;
        }
       // System.out.println("total = " + total);
        System.out.println("average is: " + (total/ num.length));


        //2nd method: By using Streams

        OptionalDouble avg =Arrays.stream(num).average();
        //System.out.println(avg.getAsDouble());
        System.out.println(avg);


    }
}
