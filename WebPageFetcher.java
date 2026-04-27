import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class WebPageFetcher {
    public static void main(String[] args) {
        String siteURL = "https://www.example.com";
        try {
            URL urlObj = new URL(siteURL);
            URLConnection connectionObj = urlObj.openConnection();
            BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(connectionObj.getInputStream())
            );
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
