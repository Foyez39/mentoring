package javaInterviewQuestions;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

    //what will be the output when you compare site URL with its ip address? - Ans: if match output: true

    public static void main(String[] args) throws MalformedURLException {

        System.out.println(new URL("https://www.amazon.com").equals(new URL("https://162.219.225.118")));

    }
}
