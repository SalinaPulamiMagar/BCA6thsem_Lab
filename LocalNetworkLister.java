import java.io.*;
import java.net.*;
import java.util.*;
public class LocalNetworkLister {
    public static void main(String[] args) throws IOException {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            System.out.println("Name: " + ni.getName());
            System.out.println("Display Name: " + ni.getDisplayName());
            System.out.println("---------------------------");
        }
    }
}
