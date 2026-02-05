import java.util.HashMap;
import java.util.Map;

public class DefaultHttpRequestBuilder implements HttpRequestBuilder {

    private final String url;
    private final String method;

    Map<String, String> headers = new HashMap<>();
    Map<String, String> queryParams = new HashMap<>();
    String body;
    int timeout;

    public DefaultHttpRequestBuilder(String url, String method) {
        this.url = url;
        this.method = method;
    }

    @Override
    public HttpRequestBuilder addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    @Override
    public HttpRequestBuilder addQueryParam(String key, String value) {
        queryParams.put(key, value);
        return this;
    }

    @Override
    public HttpRequestBuilder body(String body) {
        this.body = body;
        return this;
    }

    @Override
    public HttpRequestBuilder timeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    @Override
    public HttpRequest build() {
        validate();
        return new HttpRequest(this);
    }

    private void validate() {
        if (url == null || url.isEmpty()) {
            throw new IllegalStateException("URL is mandatory");
        }

        if (method == null || method.isEmpty()) {
            throw new IllegalStateException("HTTP method is mandatory");
        }
    }

    String getUrl() { return url; }
    String getMethod() { return method; }
    Map<String, String> getHeaders() { return headers; }
    Map<String, String> getQueryParams() { return queryParams; }
    String getBody() { return body; }
    int getTimeout() { return timeout; }
}
