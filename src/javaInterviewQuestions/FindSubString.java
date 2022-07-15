package javaInterviewQuestions;

public class FindSubString {

    //How to check substring is present in a given String?-by regular expression

    public static boolean isSubstring(String main,String sub){
        return main.matches("(.*)"+sub+"(.*)");//it can start with any string and sub-string should be part of mainString and it can end with any string.
    }

    //2nd method: substring method

    public static boolean isSubstring1(String main,String sub){
        return main.contains(sub);
    }


    //3rd method
    public static boolean isSubstring2(String main,String sub){
        return main.indexOf(sub)!=-1;
    }


    public static void main(String[] args) {

        System.out.println(isSubstring("Homeland Bangladesh","Bangladesh"));
        System.out.println(isSubstring("Homeland Bangladesh","Bangla"));
        System.out.println(isSubstring("Homeland Bangladesh","desh"));

        System.out.println(isSubstring1("Homeland Bangladesh","Homeland"));
    }
}
