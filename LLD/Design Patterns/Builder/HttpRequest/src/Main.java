public class Main {
    public static void main(String[] args) {

        HttpRequestBuilder builder =
                new DefaultHttpRequestBuilder(
                        "api.example.com/users",
                        "POST"
                );

        HttpRequest request = builder
                .addHeader("Content-Type", "application/json")
                .addQueryParam("v", "1")
                .body("{name:Koti}")
                .timeout(3000)
                .build();

        request.processRequest();
    }
}
