package javaInterviewQuestions;

public class ReverseNumber {

    //Reverse a number using recursion //123

    public static void reverse(long number){
        if(number<10){
            System.out.println(number);
        }
        else{
            System.out.print(number%10);  //123%10 ->3 reminder
            reverse(number/10);     //123/10 -> 12
        }
    }

    public static void main(String[] args) {
        reverse(123);
        reverse(333);
        reverse(3);
        reverse(785463090);
        reverse(8986432578087666348L);
        reverse(001);
        reverse(100);
        reverse(0);

    }
}
