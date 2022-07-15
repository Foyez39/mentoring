package javaInterviewQuestions;

import java.util.StringJoiner;

public class StringJoinerConcept {

    //How can you combine multiple Strings into one? Ans: By using StringJoiner class.
    public static void main(String[] args) {

        //[John,Tom,Michel]
        StringJoiner joiner=new StringJoiner(",","[","]");
        joiner.add("john");
        joiner.add("Tom");
        joiner.add("Michel");
        System.out.println(joiner.toString());
        //here we create StringJoiner object.And then add all string one by one.

    }
}
