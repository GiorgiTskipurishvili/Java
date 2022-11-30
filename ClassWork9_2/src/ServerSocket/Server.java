package ServerSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();

        out = new PrintWriter(clientSocket.getOutputStream(),true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        while (true) {
            String message = in.readLine();

            if (message.equals("help")) {
                WriteFile.writeInFile(message);
                WriteFile.writeInFile("create file dslfvjdfsv;");
                WriteFile.writeInFile("----");
                System.out.println("n1 " + message);
            } else if (message.equals("date")) {
                WriteFile.writeInFile(message);
                WriteFile.writeInFile("f2398y329823");
                WriteFile.writeInFile("----");
                WriteFile.writeInFile("n2 " + message);
            } else if (message.equals("name")) {
                WriteFile.writeInFile(message);
                WriteFile.writeInFile("lasha");
                WriteFile.writeInFile("----");
                System.out.println("n3 " + message);
            } else if (message.equals("error")) {
                WriteFile.writeInFile(message);
                WriteFile.writeInFile("Compile error");
                WriteFile.writeInFile("----");
                WriteFile.writeInFile("n4 " + message);
            } else {
                System.out.println("error...........");
                System.out.println("n1234" + message);
                close();
            }
            System.out.println("Some text to write from Server to Client " + message);
        }
    }

    public void close() throws IOException{
        serverSocket.close();
        clientSocket.close();
        out.close();
        in.close();
    }
}
