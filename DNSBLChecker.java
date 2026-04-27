import java.net.*;
public class DNSBLChecker {
    public static final String BLACKLIST_SERVICE = "bl.spamcop.net";
    public static void main(String[] args) {
        String[] ipsToCheck = {"125.12.32.4", "94.181.33.149", "207.34.56.23"};
        for (String currentIP : ipsToCheck) {
            if (isSpammer(currentIP)) {
                System.out.println(currentIP + " is listed as a spammer.");
            } else {
                System.out.println(currentIP + " is not listed as a spammer.");
            }
        }
    }
    private static boolean isSpammer(String ip) {
        try {
            InetAddress inet = InetAddress.getByName(ip);
            byte[] ipBytes = inet.getAddress();
            String queryDomain = BLACKLIST_SERVICE;

            for (byte b : ipBytes) {
                int octet = b < 0 ? b + 256 : b;
                queryDomain = octet + "." + queryDomain;
            }
            InetAddress.getByName(queryDomain);
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }
}
