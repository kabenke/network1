import java.net.*;
import java.io.*;
import java.util.Scanner;
// one way message

public class Client{

    public static void main(String[] args) {
        try {

          Socket socket = new Socket("localhost",1234); // j'Etablie une Connexion


          Scanner scanner = new Scanner (System.in);
          System.out.println("Donnez une chaine de Cahractere");

          String message = scanner.nextLine();

          PrintWriter pr = new PrintWriter (socket.getOutputStream());

          System.out.println("J'envoie le message");

          pr.println(message);
          pr.flush();


        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
