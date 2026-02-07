import java.util.Map;

public class HttpRequest {

    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;

    HttpRequest(DefaultHttpRequestBuilder builder) {
        this.url = builder.getUrl();
        this.method = builder.getMethod();
        this.headers = builder.getHeaders();
        this.queryParams = builder.getQueryParams();
        this.body = builder.getBody();
        this.timeout = builder.getTimeout();
    }

    void processRequest() {
        StringBuilder request = new StringBuilder();

        request.append(method)
                .append(" ")
                .append("https://")
                .append(url);

        if (!queryParams.isEmpty()) {
            request.append("?");
            queryParams.forEach((k, v) ->
                    request.append(k).append("=").append(v).append("&")
            );
            request.deleteCharAt(request.length() - 1);
        }

        request.append("\n");

        headers.forEach((k, v) ->
                request.append(k).append(": ").append(v).append("\n")
        );

        if (body != null && !body.isEmpty()) {
            request.append("\n");
            request.append(body);
        }

        System.out.println(request);
    }
}
