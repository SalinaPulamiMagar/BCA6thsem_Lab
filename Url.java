import java.net.*;
import java.io.*;
public class Url {
    public static void main(String[] args) {
        try {
            String urlb = URLEncoder.encode("https://www.github.com", "UTF-8");
            System.out.println(urlb);
            String deURL = URLDecoder.decode(urlb, "UTF-8");
            System.out.println(deURL);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
