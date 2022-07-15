package javaInterviewQuestions;

public class FindDuplicateElements {

    //How to find duplicate elements from an Array?
    public static void main(String[] args) {
        String data[]={"amazon","walmart","alibaba","amazon","ups","alibaba"};
        for (int i=0;i< data.length;i++){
            for(int j=i+1;j< data.length;j++){
                if(data[i].equals(data[j])){
                    System.out.println(data[i]);
                }
            }
        }




    }
}


// For doing this, we are using two loops, inner loop, and outer loop.
//By using brute force method.