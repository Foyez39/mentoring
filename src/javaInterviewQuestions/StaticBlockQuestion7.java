package javaInterviewQuestions;

public class StaticBlockQuestion7 {
static {
    System.out.println("static block");
}

    {
        System.out.println("Instance Initialization Block");
    }

    StaticBlockQuestion7 (){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new StaticBlockQuestion7();
    }
}

//Here if we run the program static block and main method will print because we know, static block call moment of class loading
//Constructor and Initialization Block will not print because we didn't make any object.
//After making object this two will be print.
//Between constructor and Initialization Block , Initialization Block will be print first.
