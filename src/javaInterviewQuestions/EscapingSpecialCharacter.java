package javaInterviewQuestions;

public class EscapingSpecialCharacter {
    //How can you escape special character in java ? or,How can you print with special character in java?
    /*
    /"Hello"/
    /'Hello'/
    '/'Hello'/'
    "/'Hello'/"
    I love "java" and "programming" and "movies"
    'I love "java" and "programming" and "movies"'

     */

    public static void main(String[] args) {
        System.out.println("/\"Hello\"/");
        System.out.println("/'Hello'/");
        System.out.println("'/'Hello'/'");
        System.out.println("\"/'Hello'/\"");
        System.out.println("I love \"java\" and \"programming\" and \"movies\"");
        System.out.println("'I love \"java\" and \"programming\" and \"movies\"'");


    }
}
