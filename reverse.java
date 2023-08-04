import java.net.*;
import java.lang.String;

//Name: Jakob Millen
//ID: 1507831

class reverse
{
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.err.println("Error: No ip provided");
            return;
        }

        for (String ip : args) {
            InetAddress ia;
            String name;
            try {
                ia = InetAddress.getByName(ip);
                name = ia.getHostName();
            } catch (UnknownHostException e) {
                System.err.println("Unknown Host: " + ip);
                continue;
            }

            int result = ip.compareTo(name);

            if(result == 0){
                name = "no name";
            }
            
            System.out.println("IP Address: " + ip + "  Name: " + name);
        }
    }
}
