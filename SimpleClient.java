import java.net.*;
import java.io.*;

//Name: Jakob Millen
//ID: 1507831

public class SimpleClient {
    public static void main(String[] args){
        if(args.length != 2){
            System.err.println("Incorrect usage: <server> <port>");
            return;
        }

        InetAddress ia;
        try{
            ia = InetAddress.getByName("localhost");
        }catch(UnknownHostException e){
            System.err.println("Unkown name for ip");
            return;
        }
        Socket sock;
        try{
            sock = new Socket(ia, 51333);
            BufferedReader read = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            
            String serverResponse;
            while((serverResponse = read.readLine()) != null){
                System.out.println(serverResponse);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
