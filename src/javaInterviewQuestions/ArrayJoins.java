package javaInterviewQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayJoins {


    public static void main(String[] args) {


        String[]batsmen={"Rohit","Virat","Dhawan","Shreyas"};
        String[]bowlers={"Hardik","Bumrah","Jaduu","Chahal"};

       Stream<String>sBat= Arrays.stream(batsmen);
       Stream<String>sBow= Arrays.stream(bowlers);
       String fullTeam[]=Stream.concat(sBat,sBow).toArray(size->new String[size]);
        for(String s: fullTeam){
            System.out.println(s);
        }

    }
}
