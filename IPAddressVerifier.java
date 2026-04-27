import java.net.*;

public class IPAddressVerifier {
    public static void main(String[] args) {
        try {
            InetAddress loopback = InetAddress.getByName("127.0.0.1");
            InetAddress privateIP = InetAddress.getByName("192.168.1.10");
            InetAddress multicastIP = InetAddress.getByName("224.0.0.1");
            InetAddress anyLocal = InetAddress.getByName("0.0.0.0");

            checkAddress(loopback);
            checkAddress(privateIP);
            checkAddress(multicastIP);
            checkAddress(anyLocal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAddress(InetAddress ip) {
        System.out.println("IP Address: " + ip.getHostAddress());
        System.out.println("Is Loopback: " + ip.isLoopbackAddress());
        System.out.println("Is Private: " + ip.isSiteLocalAddress());
        System.out.println("Is Multicast: " + ip.isMulticastAddress());
        System.out.println("Is Any Local: " + ip.isAnyLocalAddress());
        System.out.println("----------------------------");
    }
}

