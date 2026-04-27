import java.net.*;
public class GetHostInfo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.wikipedia.org");
        System.out.println(" Host Name: " + address.getCanonicalHostName());
        System.out.println("Host Address: " + address.getHostAddress());
        System.out.println("Host Name: " + address.getHostName());
        byte[] arr = address.getAddress();
        System.out.println("IP Address in bytes:");
        for (byte c : arr) {
            System.out.println(c & 0xFF);   
        }
    }
}
