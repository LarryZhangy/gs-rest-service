package hello;

public class Endpoint {

    private final long id;
    private final String url;
    private final String data;

    public Endpoint(long id, String url, String data) {
        this.id = id;
        this.url = url;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getData() {
        return data;
    }
}
