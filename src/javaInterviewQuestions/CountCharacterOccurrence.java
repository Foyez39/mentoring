package javaInterviewQuestions;

public class CountCharacterOccurrence {
//How can you count occurrence of a character in String.
    public static void getCharOccurrence(String name){
        int count=0;
        char[]wordCount=name.toCharArray();
        for(Character ch:wordCount){
            if(ch=='a'){
                count++;
            }
        }
        System.out.println(count);




    }


    public static void main(String[] args) {
        getCharOccurrence("java");



    }
}
// IN this case, we can also use HashMap[ref: FindDuplicateCharacters class]
//By using HashMap we can get occurrence for every single character.