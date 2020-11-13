import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(1234);

            System.out.println("J'attends une connexion");

            Socket s = ss.accept();     //le serveur attends une connexion

            System.out.println("clien connected");

            InputStreamReader in = new InputStreamReader(s.getInputStream());

            BufferedReader bf = new BufferedReader(in);

            String str = bf.readLine();
            System.out.println("message du client " + str);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
