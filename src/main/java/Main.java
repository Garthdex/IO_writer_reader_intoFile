import java.io.*;

/**
 * Created by Antoine on 01.12.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Coffe coffe = new Coffe("Black");
        Location location = new Location("table", coffe);

        FileOutputStream fos = new FileOutputStream("C:\\Games\\note.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try {
            oos.writeObject(location);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            oos.close();
        }

        FileInputStream fis = new FileInputStream("C:\\Games\\note.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        location = null;
        System.out.println(location);

        try {
            location = (Location) ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(location.toString());
            ois.close();
        }
    }
}
