import java.net.*;
import java.io.*;
public class User {
    public static void main(String[] args) throws IOException {
        ServerSocket ourFirstServerSocket = new ServerSocket(6789); //port no xidmete aciq oldu
        while(true){
           Socket connection = ourFirstServerSocket.accept();
           InputStream is = connection.getInputStream();
           InputStreamReader reader =new InputStreamReader(is);
           BufferedReader bReader = new BufferedReader(reader);
           String messageFromClient = bReader.readLine();
            System.out.println("Message From Client: "+messageFromClient);
            
        }

    }
}
