package javaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    //How to print duplicate characters from String?

    public static void printDuplicateCharacters(String str){
        if(str==null){
            System.out.println("null string");
        }
        if(str.isEmpty()){
            System.out.println("empty string");
        }
        if(str.length()==1){
            System.out.println("single char string");
        }
        char[]words=str.toCharArray(); //java
        Map<Character,Integer> charMap= new HashMap<Character,Integer>();
        for(Character ch: words){
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);

            }
            else{
                charMap.put(ch,1);
            }
        }
        //print the map;
       Set<Map.Entry<Character,Integer>>entrySet=charMap.entrySet();
        for(Map.Entry<Character,Integer>entry:entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ ":" + entry.getValue());
            }
        }
       // System.out.println(entrySet);
       // charMap.forEach((k,v) -> System.out.println(k + ":" + v));




    }





    public static void main(String[] args) {
       printDuplicateCharacters("java");


    }
}


/*
suppose, String s= "java" [ a 2 times duplication]

            String s="Nahar" [ a 2 times duplication]

            String s="Nazmon"[ NO duplicate because one N is capital, another n is small]- NULL
            String s="Tom" [ Null- no duplication]
  1.s==null; return nothing
  2.s.isEmpty ; return nothing
  3. s.length() is 1 ; return nothing

  - Before checking duplication we must check these three condition.

 */


/*
i'll convert the String to CharacterArray[]. Then i'll use HashMap where character will be use as 'key' and
Integer will be use as 'value'.
Now,i'll do for each loop with condition is like if hashmap object doesn't contain the character the value of the key(character) will put 1.
if hashmap object contains the key[it will contain when it repeated] then i'll put that character in HashMap object.
and add 1 with that character.

->now i'll print the map

To print map i'll use entrySet





 */