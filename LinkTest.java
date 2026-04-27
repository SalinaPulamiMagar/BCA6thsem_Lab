import java.net.*;
public class LinkTest {
    public static void main(String[] args) throws MalformedURLException {
        String baseurl = "https://samriddhicollege.edu.np/wp-content/uploads/2019/09/";
        String relativeUrl = "Networking_Programming-Syllabus.zip";
        URL baseUrl = new URL(baseurl);
        URL resolvedRelativeUrl = new URL(baseUrl, relativeUrl);
        System.out.println("Base URL: " + baseurl);
        System.out.println("Relative URL: " + relativeUrl);
        System.out.println("Resolved Relative URL: " + resolvedRelativeUrl);
    }
}
