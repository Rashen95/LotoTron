import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DBreader {
    public ArrayList<Toy> read() throws FileNotFoundException {
        Scanner s = new Scanner(new File("db.txt"));
        ArrayList<Toy> Toys = new ArrayList<>();
        while (s.hasNext()) {
            String db = s.nextLine();
            String[] dbList = db.split(" ");
            Toys.add(new Toy(Integer.parseInt(dbList[0]), dbList[1], Integer.parseInt(dbList[2]), Integer.parseInt(dbList[3])));
        }
        return Toys;
    }
}
