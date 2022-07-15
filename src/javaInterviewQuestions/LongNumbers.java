package javaInterviewQuestions;

public class LongNumbers {

   //what will be the output when you use a long number with L and without L suffix?


    public static void main(String[] args) {

        long longNumberWithoutL=300*45*99*999*20;
        long longNumberWithL=300*45*99*999*20L;
        System.out.println(longNumberWithoutL); //933466224
        System.out.println(longNumberWithL);  //26703270000

        // 26703270000-- 36 bits
        //011000110111101000111001000001110000
        //maximum limit of int is : 32 bit -(933466224)

// since maximum limit of int is 32 bit And we do not put L then java will truncate first 4 binary value to adjust because it should not cross the limit.
//And it's output will be 933466224.
//The L suffix tells the compiler that we have a long number literal.
    }
}
