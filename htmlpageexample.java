import java.io.*;
import java.net.*;
public class htmlpageexample {
    public static void main(String[] args) {
        String fileName = "index.html";
        try {
            URL siteUrl = new URL("https://www.youtube.com");
            URLConnection conn = siteUrl.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader br1 = new BufferedReader(
          new InputStreamReader(conn.getInputStream())
            );
            BufferedWriter bw2 = new BufferedWriter(
            new FileWriter(fileName)
            );
            String data;
            while ((data = br1.readLine()) != null) {
                bw2.write(data);
                bw2.newLine();
            }
            br1.close();
            bw2.close();
            System.out.println("Download complete: " + fileName);
        } catch (IOException ex) {
            System.err.println("Failed: " + ex.getMessage());
        }
    }
}
