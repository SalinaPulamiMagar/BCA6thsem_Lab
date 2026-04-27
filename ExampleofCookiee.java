import java.net.*;
import java.util.List;
public class ExampleofCookiee {
 public static void main(String[] args) throws Exception {
 final String URL_String = "https://www.google.com/";
 CookieManager cookieManager = new CookieManager();
 CookieHandler.setDefault(cookieManager);
 URL url4 = new URL(URL_String);
 URLConnection connection = url4.openConnection();
 connection.getContent();
 CookieStore cookieStore = cookieManager.getCookieStore();
 List<HttpCookie> cookieList = cookieStore.getCookies();
 for (HttpCookie cookie : cookieList) {
 System.out.println("Domain: " + cookie.getDomain());
 System.out.println("Max age: " + cookie.getMaxAge());
 System.out.println("Name: " + cookie.getName());
 System.out.println("Path: " + cookie.getPath());
 System.out.println("Is secure: " + cookie.getSecure());
 System.out.println("Value: " + cookie.getValue());
 System.out.println("Version: " + cookie.getVersion());
 System.out.println("----------------------");
 }
}
}