import java.net.*;

//Name: Jakob Millen
//ID: 1507831

class resolve
{
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.err.println("Error: No names provided");
            return;
        }

        for (String name : args) {
            InetAddress ia;
            try {
                ia = InetAddress.getByName(name);
            } catch (UnknownHostException e) {
                System.err.println("Unknown Host: " + name);
                continue;
            }

            String ip = ia.getHostAddress();
            System.out.println("Name: " + name + "  IP Address: " + ip);
        }
    }
}
