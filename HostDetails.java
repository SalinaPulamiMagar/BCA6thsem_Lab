import java.net.*; 
public class HostDetails { 
    public static void main(String[] args) throws Exception { 
        InetAddress localHost = InetAddress.getLocalHost(); 
        System.out.println(localHost.getHostAddress()); 
        System.out.println(localHost.getHostName()); 
    } 
}
