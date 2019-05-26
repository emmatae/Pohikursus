package Analytics;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;


public final class App {

    public static void main(String[] args) {
        DelfiScraper scraper = new DelfiScraper("htttp://delfi.ee");
        scraper.run();
    }
}