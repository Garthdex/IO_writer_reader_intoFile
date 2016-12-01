/**
 * Created by Antoine on 01.12.2016.
 */
public class Location {
    private String name;
    Coffe one = new Coffe();

    public Location(String name, Coffe one) {
        this.name = name;
        this.one = one;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", Coffe=" + one.getName() +
                '}';
    }
}
