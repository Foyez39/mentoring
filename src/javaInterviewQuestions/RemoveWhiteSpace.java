package javaInterviewQuestions;

import com.sun.deploy.util.StringUtils;

public class RemoveWhiteSpace {
    //How will you remove all whitespaces from a String?

    public static void main(String[] args) {
        String str="  This is   my java         code        ";

      System.out.println(str.trim());
       /* -- Here problem is that, trim() method only remove before and after whitespaces of the line
        NOT within word.

        That's why we will use replaceAll method to remove all whitespaces
         */

       // System.out.println(str.replaceAll("\\s",""));
        System.out.println(str.replaceAll("\\s+",""));
        /*
        Here both s and s+ gives the same output. But difference is that s+ is fast. it collects all the
        whitespaces and replace together. s collect and replace whitespaces one by one.
         */

        //3rd in-built method: StringUtils  [here,trim();replaceAll();StringUtils are in-built methods]
        System.out.println(StringUtils.trimWhitespace(str));




    }
}
