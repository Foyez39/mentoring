package javaInterviewQuestions;

public class NullArgument {

    //pass null argument with method overloading with String and Object types

    public static void test(Object o){
        System.out.println("Object Argument");
    }

    public static void test(String s){
        System.out.println("String Argument");
    }
   /* public static void test(StringBuffer s){
        System.out.println("String Argument");
    }

    public static void test(StringBuilder s){
        System.out.println("String Argument");
    } */    // we can not do it with StringBuffer and StringBuilder.there is compiler error(ambiguous error i.e java confused).
            //because same thing we can do with String. String, StringBuffer are independent. There are no hierarchy between String and StringBuffer.


    public static void main(String[] args) {


        test(null);

        // In this case, Java has two choices available to choose,
        // so Java will have to find the most specific one.
        //Since Object is the super-type of String type, the string
        // version is more specific than the Object version. So, if only those two methods exist,
        // the String version will be chosen.
    }









}
//non-primitive data type can take null value.
// That means, null assigned to reference variable.