import java.net.*;
import java.io.*;

//Name: Jakob Millen
//ID: 1507831

public class SimpleServer {
    public static void main(String[] args){
        try{
            //Listen on port 51333 for incoming connections
            ServerSocket ss = new ServerSocket(51333);
            System.out.println("Listening on port " + ss.getLocalPort());


            while(true){
                Socket s = ss.accept();
                String clientAddress = s.getInetAddress().getHostName();

                PrintWriter write = new PrintWriter(s.getOutputStream(), true);

                //Send greeting to the client
                write.println("Hello, " + clientAddress + ".");
                write.println("Your IP address is " + s.getInetAddress().getHostAddress());

                //Close the socket
                s.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }

}
