package javaInterviewQuestions;

public class StaticBlockQuestions6 {
    //Can we initialize member variables within static block?- YES
 String name;
static int age;
static {
    StaticBlockQuestions6 obj= new StaticBlockQuestions6();
    obj.name="Foyez";
    age=28;
    System.out.println(obj.name+" "+age);
}

    public static void main(String[] args) {




    }

    //Here, directly we can not initialize non-static member variables inside static block. In that case,
    //we have to create the object inside static block. Then with the help of obj.name we can access.
    //For static member variable we do not need  to object.Directly we can initialize.

}



/*
   1. Explain static blocks in Java?
   2. How can we run a java program without making any object?
   3. similarity and Difference between static block and static method?
   4. How can we create objects if we make the constructor private?
   5.Is it possible to compile and run a Java program without writing main()method?
   6. Can we initialize member variables within static block?
*/