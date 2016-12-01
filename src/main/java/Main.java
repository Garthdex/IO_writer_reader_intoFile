import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Antoine on 01.12.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Coffe coffe = new Coffe("Black");
        Location location = new Location("table", coffe);
        FileWriter writer = null;
        FileReader reader = null;

        try {
            writer = new FileWriter("C:\\Games\\note.txt", false);
            writer.write(location.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            writer.close();
        }

        try {
            reader = new FileReader("C:\\Games\\note.txt");
            String out = "";
            int c;
            while((c = reader.read()) != -1) {
                out += (char) c;
            }
            System.out.println(out);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }


    }
}
