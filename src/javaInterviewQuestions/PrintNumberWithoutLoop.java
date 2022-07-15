package javaInterviewQuestions;

public class PrintNumberWithoutLoop {

public static void printNumber(int num){
    if(num<=100){
        System.out.println(num);
        num++;
        printNumber(num);
    }


}


    public static void main(String[] args) {
    printNumber(1);


}

    }




//How to print 1 to 100 without using any loop?
// Ans - we can use recursive method