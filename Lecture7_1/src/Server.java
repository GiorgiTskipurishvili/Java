import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread{
    Socket s;
    ObjectInputStream in;

    ObjectOutputStream out;
    String m;



    public void run(){

        try {
            ServerSocket ss = new ServerSocket(8089);
            s = ss.accept();
            while (true) {
                in = new ObjectInputStream(s.getInputStream());
                System.out.println("S-> " + in.readObject());


                Scanner scanner = new Scanner(System.in);
                System.out.println("Server: ");
                m = scanner.nextLine();
                out = new ObjectOutputStream(s.getOutputStream());
                out.writeObject(m);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }


//        for (int i=0; i<30;i++){
//            System.out.println("Server!!!");
//        }
//        System.out.println("Server!!!");
    }
}
