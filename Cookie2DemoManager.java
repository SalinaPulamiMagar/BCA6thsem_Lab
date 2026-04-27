import java.net.*;
import java.io.*;
import java.util.*;
public class Cookie2DemoManager {
    public static void main(String[] args) throws IOException {
        final String URL_String = "https://www.wikipedia.org";
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();
        HttpCookie cookiee2 = new HttpCookie("First", "1");
        HttpCookie cookie2 = new HttpCookie("Second", "2");
        cookiee2.setMaxAge(3600); 
        cookiee2.setSecure(true); 
        URI Uri = URI.create(URL_String);
        cookieStore.add(Uri, cookiee2);
        cookieStore.add(Uri, cookiee2);
        System.out.println("Cookies successfully added\n");
        List<HttpCookie> cookiesWithURI = cookieStore.get(Uri);
        System.out.println("Cookies associated with URI in CookieStore: " + cookiesWithURI + "\n");
        List<HttpCookie> cookieList = cookieStore.getCookies();
        System.out.println("Cookies in CookieStore: " + cookieList + "\n");
        List<URI> uriList = cookieStore.getURIs();
        System.out.println("URIs in CookieStore: " + uriList + "\n");
        System.out.println("Removal of Cookie: " + cookieStore.remove(Uri, cookiee2));
        System.out.println("Remaining Cookies: " + cookieList + "\n");
        System.out.println("Removal of all Cookies: " + cookieStore.removeAll());
        System.out.println("Empty CookieStore: " + cookieList);
    }
}
