package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String data;

    public Greeting(long id, String content, String data) {
        this.id = id;
        this.content = content;
	this.data = data;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getData() {
        return data;
    }
}
