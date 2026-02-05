public interface HttpRequestBuilder {

    HttpRequestBuilder addHeader(String key, String value);

    HttpRequestBuilder addQueryParam(String key, String value);

    HttpRequestBuilder body(String body);

    HttpRequestBuilder timeout(int timeout);

    HttpRequest build();
}
