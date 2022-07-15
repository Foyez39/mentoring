package javaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class RepeatNumberCount {

//count the repeated number
    public static void getDigitCount(long number){
        Map<Long,Integer>digitMap=new HashMap<Long,Integer>();

     while (number!=0){
         long lastDigit=number%10;
         if(digitMap.containsKey(lastDigit)){
             digitMap.put(lastDigit,digitMap.get(lastDigit)+1);
         }
         else{
             digitMap.put(lastDigit,1);
         }
         number=number/10;
     }
        digitMap.forEach((k,v) -> System.out.println("Repetition of " + k + " is : " + v + " times "));  //stream
    }




    public static void main(String[] args) {
        getDigitCount(343679876332110603L);

    }
}
