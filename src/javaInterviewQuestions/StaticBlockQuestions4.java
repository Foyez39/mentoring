package javaInterviewQuestions;

public class StaticBlockQuestions4 {
   // How can we create objects if we make the constructor private?

   int age;


   public static void makeObject(){
       StaticBlockQuestions4 obj1= new StaticBlockQuestions4();
       System.out.println(obj1.age);
   }
    private StaticBlockQuestions4(){
        age=45;
    }



    public static void main(String[] args) {
        StaticBlockQuestions4 obj= new StaticBlockQuestions4();
        System.out.println(obj.age);
    }


}



//If we make the constructor private, though we can call the object within the class But we can not call the object outside of the calss.
//In that case we will make a static method and will put/create the object inside the static method. Then we will call this static method outside of the class.[see TestingBlock class]






/*
   1. Explain static blocks in Java?
   2. How can we run a java program without making any object?
   3. similarity and Difference between static block and static method?
   4. How can we create objects if we make the constructor private?
   5.Is it possible to compile and run a Java program without writing main()method?
   6. Can we initialize member variables within static block?
     */