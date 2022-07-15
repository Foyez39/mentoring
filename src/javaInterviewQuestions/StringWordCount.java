package javaInterviewQuestions;

public class StringWordCount {

    //Get the count of total words in a given Capitalized String.

    public static void main(String[] args) {
        String str="HomelandIsBangladesh";

        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);



        //2nd method: Using Character class
        //here loop will check every single character and it will take the upper(capital ) character.
        int count1=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                count1++;
            }
        }
        System.out.println(count1);

    }
}
