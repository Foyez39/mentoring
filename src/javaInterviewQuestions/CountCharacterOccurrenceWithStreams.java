package javaInterviewQuestions;

public class CountCharacterOccurrenceWithStreams {

    //Count the number of occurrences of a given character in aString using java 8 Streams?
    public static void main(String[] args) {
        String str= "Testing solutions";
       // long count=str.chars().filter(j -> (char)j=='s').count();
        long count=str.chars().filter(value -> (char)value=='s'||(char)value=='i').count();
        System.out.println(count);

    }
}
