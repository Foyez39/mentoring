package javaInterviewQuestions;

public class PrintWithBlankMain {

    //can you print 'hello world' with Blank Main method? - yes, with static block.
    //can you print 'hello world' without static block and with blank Main method - yes, with static method and static variable.

//    static {
//        System.out.println("Hello world");
//    }
    public static int printString(){
        System.out.println("Hello world");
        return 1;
    }
    static int i= printString();


    public static void main(String[] args) {

    }


}

//we know static block load at the moment of class loading before main method. we used that technique here.

//2nd method: since static method donot call automatically like static block we make static variable and put
//static method to static variable. Now , when static variable will load right away with class loading, it will call
//static method and then print statement will print.
//we are not worry about return because it just a technique.