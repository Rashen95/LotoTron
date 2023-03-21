import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class DrowToy {
    public void drow(ArrayList<Toy> t) throws FileNotFoundException {
        Random r = new Random();
        boolean flag = false;
        while (!flag) {
            for (Toy toy : t) {
                if (r.nextInt(1, 101) <= toy.getChance()) {
                    toy.downQuantity();
                    System.out.println(new UInterfaceMess().winMess(toy.getName()));
                    flag = true;
                }
            }
        }
        try (FileWriter writer = new FileWriter("db.txt", false)) {
            int count = 0;
            while (count < t.size()) {
                if (t.get(count).getQuantity() > 0) {
                    writer.append(String.format("%d %s %d %d\n", t.get(count).getId(), t.get(count).getName(),
                            t.get(count).getQuantity(), t.get(count).getChance()));
                }
                count++;
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        new Menu().mainMenu();
    }
}
