package network;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

    public static void main(String[] args) {
        tryGetRequest();
        tryPostRequest();
    }

    static void tryGetRequest() {
        HttpClient httpClient = HttpClient.newHttpClient();

        URI firstWebSiteAddress = URI.create("http://info.cern.ch/hypertext/WWW/TheProject.html");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(firstWebSiteAddress)
                .GET() // we can skip it, because the builder creates GET query by default
                .build();

        try {
            HttpResponse<String> response = httpClient.send(
                    request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode()); // 200 if everything is OK
            System.out.println(response.body());       // a long HTML text
        } catch (Exception e) {
            System.out.println("We cannot access the site. Please, try later.");
        }
    }

    static void tryPostRequest() {
        HttpClient httpClient = HttpClient.newHttpClient();

        URI fakePostService = URI.create("https://jsonplaceholder.typicode.com/posts");
        String bookData = "{\"title\":\"The Invisible Man\", \"author\":\"H. G. Wells\"}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(fakePostService)
                .header("Content-Type", "application/json") // we specify that we send a JSON
                .POST(HttpRequest.BodyPublishers.ofString(bookData))
                .build();

        try {
            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode()); // 201 if everything is OK
            System.out.println(response.body());       // a JSON response with ID
        } catch (Exception e) {
            System.out.println("We cannot send data. Please, try later.");
        }
    }
}
