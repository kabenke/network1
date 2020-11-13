import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;

public class Server 
{
    public static void main(String[] args) {
        try {
            
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("J'attends une connexion....");
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            System.out.println("J'attends un nombre");
            int nb = is.read();
            int res = nb*12;
            System.out.println("J'envoie la reponse");
            os.write(res);
            s.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}