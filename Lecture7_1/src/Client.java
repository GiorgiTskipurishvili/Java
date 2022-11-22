import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable{
    Socket s;
    ObjectOutputStream out;
    String m;

    ObjectInputStream in;



    @Override
    public void run(){
        try {
            s = new Socket(InetAddress.getByName("localhost"), 8089);

            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Client: ");
                m = scanner.nextLine();
                out = new ObjectOutputStream(s.getOutputStream());
                out.writeObject(m);

                in = new ObjectInputStream(s.getInputStream());
                System.out.println("C-> " + in.readObject());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


//        for (int i=0; i <30; i++){
//            System.out.println("Client!!!");
//        }
//        System.out.println("Client!!!");
    }
}
