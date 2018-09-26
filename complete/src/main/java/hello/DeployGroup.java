package hello;

public class DeployGroup {

    private final long id;
    private final String name;
    private final String data;

    public DeployGroup(long id, String name, String data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }
}
