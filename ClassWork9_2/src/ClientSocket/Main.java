package ClientSocket;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Client c = new Client();
        c.startConnection("192.168.1.6", 8081);

        System.out.println(c.sendMessage("help"));
        System.out.println(c.sendMessage("date"));
        System.out.println(c.sendMessage("name"));
        System.out.println(c.sendMessage("error"));
        c.sendMessage("end");
    }
}
