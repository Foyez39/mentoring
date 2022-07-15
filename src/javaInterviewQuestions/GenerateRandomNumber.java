package javaInterviewQuestions;

import java.util.Random;

public class GenerateRandomNumber {
    /*
    Generate Random Number in Java: 1. By using Random Class
                                    2. By using Math.random()
                                    3.ThreadLocalRandom
      use cases: Random Number in email, phone number etc...
     */

    public static void main(String[] args) {

        Random random= new Random();
       // System.out.println("random int: "+ random.nextInt());
        //To generate multiple random number:
        for (int i=1;i<=5;i++){
            System.out.println("random int: "+ random.nextInt());
            System.out.println("random double: "+ random.nextDouble());
            System.out.println("random float: "+ random.nextFloat());
        }

        System.out.println("------------------");
        //2nd method:
        //Math.random() always gives double value;
        for(int i=1;i<=5;i++){
            System.out.println(Math.random());
        }


        System.out.println("-------range------");
        //To generate random number within any range. Like i want to generate 5 random number from 1 to 30.

        for(int i=1;i<=5;i++){
            System.out.println(random.nextInt(30));  // 0 to 30

        }


    }
}
