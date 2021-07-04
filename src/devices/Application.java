package devices;

public class Application {
    public String name;
    public String version;
    public Double price;

    public Application(String name, String version, Double price)
    {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
