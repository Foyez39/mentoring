package javaInterviewQuestions;

public class StaticBlockWQuestion {
    //can we call one static method inside another static method? - YES

    public static void test(){
        System.out.println("testing method");
    }

    public static void cover(){
        System.out.println("cover method");
        test();
    }

    public static void main(String[] args) {
        test();
        cover();



        //Here,first we call the test method in mainMethod. Then we again called the test method through another static method 'cover method'
        //But before that we call cover method in MainMethod and cover method print it's inside statement and called it's inside test method.
    }
}
