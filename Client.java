import java.net.*;
import java.io.*;
import java.util.Scanner;
// one way message

public class Client{

    public static void main(String[] args) {
        try {

          Socket socket = new Socket("localhost",1234); // j'Etablie une Connexion


          Scanner scanner = new Scanner (System.in);
          System.out.println("Entrez votre message");

          String message = scanner.nextLine();

          PrintWriter pr = new PrintWriter (socket.getOutputStream());

          System.out.println("J'envoie le message");

          pr.println(message);
          pr.flush();

          System.out.println("Message envoyer");

          System.out.println("J'Attends la reponse du serveur");
          InputStreamReader in = new InputStreamReader(socket.getInputStream());

          BufferedReader bf = new BufferedReader(in);

          String response = bf.readLine();

          System.out.println("Server : "+response);

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
