package javaInterviewQuestions;

public class TestNum {

    public static void main(String[] args) {
        //compare two int numbers( Integer Caching)

        Integer x=390;
        Integer y=390;
        if (x==y){
            System.out.println("both are equal");
        }
        else {
            System.out.println("both are not equal");
        }





    }
}


//Java integer cache was  introduced to save the memory and improve performance
// for Integer type objects handling.
//Integer Cach range is -128 to 127.