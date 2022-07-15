package javaInterviewQuestions;

public class StaticBlockQuestions2And3 {

    //How can we run a java program without making any object?

    static {
        System.out.println("static block");
    }

    public static void test(){
        System.out.println("testing method");
    }



    public static void main(String[] args) {

        System.out.println("main method");
        test();
        StaticBlockQuestions2And3.test();

        //Here if we run the program , static block and main method will be run. Because static block will be
        //called the moment will load the class.And main method will run by JVM.


        //To run the static method 'test' we have to call it either by class or method itself.
    }



    /*
    Answer for question 3:
    3. similarity and Difference between static block and static method?
   Ans: similarity: Both are static in nature. we do not need to create object in both cases.
   difference:static block will be called automatically the moment class is loaded. static method will not
   be called automatically,we have to call explicitly by either direct calling or by using class name.
     */




}




/*
   1. Explain static blocks in Java?
   2. How can we run a java program without making any object?
   3. similarity and Difference between static block and static method?
   4. How can we create objects if we make the constructor private?
   5.Is it possible to compile and run a Java program without writing main()method?
   6. Can we initialize member variables within static block?
     */