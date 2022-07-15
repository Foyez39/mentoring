package javaInterviewQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumW {
    // In Interview you should know what you do not know to  say I do not know
  static String str="In Interview you should know what you do not know to say I do not know";
    public static void maximumOccurrence(){
        Map<String,Integer>wordMap= new HashMap<String,Integer>();
        String [] words=str.toLowerCase().split(" ");   //toLowerCase() is static method.

        for(String word: words){

            if(wordMap.containsKey(word)){
                wordMap.put(word,wordMap.get(word)+1);
            }
            else{
                wordMap.put(word,1);
            }
        }
   //     wordMap.forEach((k,v) -> System.out.println(k + ":" + v));
        Set<Map.Entry<String,Integer>> entrySet=wordMap.entrySet();
        for(Map.Entry<String,Integer>entry:entrySet){
            if(entry.getValue().equals(Collections.max(wordMap.values()))){
                System.out.println(entry.getKey()+ ":" + entry.getValue());
            }
        }

    }




    public static void main(String[] args) {
        maximumOccurrence();



    }
}
