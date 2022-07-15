package javaInterviewQuestions;

import java.text.DecimalFormat;

public class ElementPercentage {

    public static void getCharPercentage(String str){

        int upperCaseCount=0;
        int lowerCaseCount=0;
        int digits=0;
        int specialChars=0;

        char[]cha=str.toCharArray();
        for(Character c:cha){
            if(Character.isUpperCase(c)){
                upperCaseCount++;
            }
            else if(Character.isLowerCase(c)){
                lowerCaseCount++;
            }
            else if(Character.isDigit(c)){
                digits++;
            }
            else {
              specialChars++;
            }
        }
       double upperCasePercentage= (upperCaseCount * 100.0) /str.length();
        double lowerCasePercentage= (lowerCaseCount * 100.0) /str.length();
        double digitsPercentage= (digits * 100.0) /str.length();
        double specialCharsPercentage= (specialChars * 100.0) /str.length();

        DecimalFormat formatter = new DecimalFormat("##.##");


        System.out.println(" upperCase % : " + formatter.format(upperCasePercentage));
        System.out.println("lowerCase % : "+ formatter.format(lowerCasePercentage));
        System.out.println("digits % : "+ formatter.format(digitsPercentage));
        System.out.println("specialCharacter % : "+ formatter.format(specialCharsPercentage));


    }

    public static void main(String[] args) {

        getCharPercentage("Interview_2022");
    }
}
