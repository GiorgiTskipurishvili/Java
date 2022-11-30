package ServerSocket;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeInFile(String myText) throws IOException{
        FileWriter writer = new FileWriter("info.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(myText+"\n");
        bufferedWriter.close();
    }
}
