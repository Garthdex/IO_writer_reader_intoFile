/**
 * Created by Antoine on 01.12.2016.
 */
public class Coffe {
    private String name;

    public Coffe() {
    }

    public Coffe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "name='" + name + '\'' +
                '}';
    }
}
