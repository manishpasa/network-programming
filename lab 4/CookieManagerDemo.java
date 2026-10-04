import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;
public class CookieManagerDemo {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();

        // Add a cookie to the store
        HttpCookie cookie = new HttpCookie("user1", "123456");
        HttpCookie cookie2 = new HttpCookie("user2", "abcdef");
        HttpCookie cookie3 = new HttpCookie("user3", "xyz789");

        cookie.setDomain("example.com");
        cookie.setPath("/");
        cookieStore.add(URI.create("http://example.com"), cookie);
        cookieStore.add(URI.create("http://example.com"), cookie2);
        cookieStore.add(URI.create("http://example.com"), cookie3);
    
        // Retrieve cookies for a specific URI
        List<HttpCookie> cookies = cookieStore.get(URI.create("http://example.com"));
        for (HttpCookie c : cookies) {
            System.out.println("Cookie: " + c);
        }
    }
}