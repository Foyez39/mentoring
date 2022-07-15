package javaInterviewQuestions;

import java.io.IOException;

public class AppRun {

    //How can you Launch external Apps(Notepad,Browser,VLC Media Player) using java? - By Runtime class.[runtime.executable command]

    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime runtime=Runtime.getRuntime();
        Process pr=runtime.exec("notepad.exe");
       // Process pro=runtime.exec("notepad.exe \"C:\\Users\\flyer\\OneDrive\\Desktop\\git.txt\"");     -To open specific file
        Thread.sleep(3000);
        pr.destroy();

//        String s[]=new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.amazon.com/"};
//        runtime.exec(s);

    }
}
