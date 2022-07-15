package javaInterviewQuestions;

import jdk.nashorn.internal.ir.UnaryNode;

public class DivideByZero {

    public static void main(String[] args) {
        //what will be the output when you divide a number by zero?
        //Number= Integer, Double, Float


        System.out.println(3/0); // return ArithmeticException
        System.out.println(3.0/0); //  infinity
        System.out.println(3/0.0); //infinity
        System.out.println(3.66f/0); //infinity
        System.out.println(3.66d/0); //infinity
        System.out.println(3.66/0.0); //infinity
        System.out.println(0/0); //return ArithmeticException
        System.out.println(0/0.0); // NaN - Not a number (undefined)
        System.out.println(0.0/0.0);// NaN


        System.out.println(Float.NaN==Float.NaN);  //return 'false' because two undefined can not be equal
        System.out.println(Float.NaN!=Float.NaN); // return 'true' because here two undefined are not equal



    }
}

// ArithmeticException comes only with integers