import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Client{

    public static void main(String[] args) {
        try {
          System.out.println("Etablir une connexion vers le serveur ");
          Socket socket = new Socket("localhost",1234);
          InputStream is = socket.getInputStream();
          OutputStream os = socket.getOutputStream();

          Scanner scanner = new Scanner (System.in);
          System.out.println("Donner un nombre");

          int nb = scanner.nextInt();

          System.out.println("J'envoie la requette");
          os.write(nb);
          int rep = is.read();
          System.out.println("Reponse = "+rep );
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
