package javaInterviewQuestions;

public class StaticBlockWithFinal {

//will static block be executed with final variable
//Ans: No, static block will not be executed with static final variable - But if we remove static from final variable, static block will be executed( in this case we have to create object to call this variable)


    public static void main(String[] args) {
        System.out.println(Main.x);
        // System.out.println(new Main().x);   --if we remove static from final int.


    }
}

class Main{
    public static final int x=100;
    static {
        System.out.println("la la la");
    }
}

//property of static block is that: static block load before the main method.here we donot have main method
// if we remove final then static block will execute.
//First static block will execute then variable part.
//If we put final then java will not load Main class and directly it will take from common memory allocation.
