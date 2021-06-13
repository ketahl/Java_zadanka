package devices;

public class Phone extends Device {

    @Override
    public String toString() {
        return "Phone{} model: " + this.model ;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon robi brrr");
    }
}
