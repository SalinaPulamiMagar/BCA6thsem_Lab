import java.net.*;
public class NetworkInfo {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        String host = localHost.getHostName();
        String ipAddress = localHost.getHostAddress();
        NetworkInterface netIf = NetworkInterface.getByInetAddress(localHost);
        byte[] macAddress = netIf.getHardwareAddress();
        System.out.println("Hostname: " + host);
        System.out.println("IP Address: " + ipAddress);
        System.out.print("MAC Address: ");
        if (macAddress != null) {
            for (int i = 0; i < macAddress.length; i++) {  
                System.out.printf("%02X", macAddress[i]); 
                if (i < macAddress.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println();
        } else {
            System.out.println("Address not available.");
        }
    }
}
