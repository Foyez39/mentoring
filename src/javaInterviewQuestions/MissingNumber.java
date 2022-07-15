package javaInterviewQuestions;

public class MissingNumber {


    public static void main(String[] args) {
        int [] array = {10, 2, 1, 4, 5, 3, 7, 8, 6}; //the length of this array is n-1.
        int n= array.length +1;
        int sum= (n* (n+1))/2;
        for(int i=0;i<array.length; i++) {
            sum = sum-array[i];
        }
        System.out.println("Missing number is : "+ sum);

    }
}
