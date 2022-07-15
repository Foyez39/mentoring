package javaInterviewQuestions;

public class LengthWithoutLengthMethod {

    //How to find length of string in java without using length method?
    public static void main(String[] args) {

        String str="America";
       /* System.out.println(str.length());
       Here we are using length() method.But we must find the length without this method]
        */
        //1.
        System.out.println(str.toCharArray().length); //here we are using length variable not method.
        //2.
       // System.out.println(str.lastIndexOf(""));

        //3.
        System.out.println(str.split("").length);


        //4.
        int count=0;
        for(char c:str.toCharArray()){
            count++;
        }
        System.out.println(count);


    }



}
