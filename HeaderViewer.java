import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
public class HeaderViewer {
    public static void main(String[] args) {
        String webAddress = "https://www.mozilla.org";
        try {
            URL url = new URL(webAddress);
            URLConnection conn = url.openConnection();
            Map<String, java.util.List<String>> headers = conn.getHeaderFields();
            System.out.println("HTTP Headers for " + webAddress + ":\n");
            for (Map.Entry<String, java.util.List<String>> entry : headers.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
