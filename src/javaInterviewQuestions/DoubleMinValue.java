package javaInterviewQuestions;

public class DoubleMinValue {

    /*
    what is the value of double MIN_VALUE?
    which one is bigger-> Double MIN_VALUE or 0.0d ?
    which one is bigger -> Double MIN_VALUE or NEGATIVE_INFINITY?
     */


    public static void main(String[] args) {

        System.out.println(Double.MIN_VALUE);  // is a +ve number
        System.out.println(Long.MIN_VALUE);    //is a -ve number
        System.out.println(Integer.MIN_VALUE);  //is a -ve number


        System.out.println(Math.min(Double.MIN_VALUE,0.0d));  //Double.Min_value is bigger since it's a positive number
        System.out.println(Math.max(Integer.MIN_VALUE,0));    //0 is bigger since Integer.MIN_VALUE  is negative number

        System.out.println(Float.MIN_VALUE);  // is a +ve number

        System.out.println(Math.min(Double.MIN_VALUE,Double.NEGATIVE_INFINITY)); //Double.MIN_VALUE is bigger



    }
}
