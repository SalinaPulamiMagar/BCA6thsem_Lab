import java.net.*;
import java.util.*;
public class ReadCookies {
    private static final String WEB_ADDRESS = "https://www.google.com";
    public static void main(String[] args) throws Exception {
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        URL webUrl = new URL(WEB_ADDRESS);
        URLConnection urlConnection = webUrl.openConnection();
        urlConnection.getContent();
        CookieStore store = cookieManager.getCookieStore();
        List<HttpCookie> cookieData = store.getCookies();
        for (HttpCookie c : cookieData) {
            System.out.println("Cookie Name: " + c.getName());
            System.out.println("Cookie Value: " + c.getValue());
            System.out.println("Domain: " + c.getDomain());
            System.out.println("Path: " + c.getPath());
            System.out.println("Secure: " + c.getSecure());
            System.out.println("Max Age: " + c.getMaxAge());
            System.out.println();
        }
    }
}
