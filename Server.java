import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(1234);

            System.out.println("J'attends une connexion");

            Socket s = ss.accept();     //le serveur attends une connexion

            System.out.println("client connected");

            InputStreamReader in = new InputStreamReader(s.getInputStream());

            BufferedReader bf = new BufferedReader(in);

            String str = bf.readLine();
                                           //si le client envoie un message
            if (str != null) {

            System.out.println("message du client " + str);

            System.out.println("J'envoie une reponse au client");

            PrintWriter pr = new PrintWriter(s.getOutputStream());
            pr.println("Nous avons recu votre message et vous aurez une reponse d'ici bientot");
            pr.flush();
            }
            else{System.exit(0);}//si non je sors

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
