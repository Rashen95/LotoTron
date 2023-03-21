import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToyAdder {
    public void add(ArrayList<Toy> Toys) {
        UInterfaceMess UI = new UInterfaceMess();
        String name = null;
        int quantity = 0;
        int chance = 0;
        boolean flag = false;
        while (!flag) {
            System.out.println(UI.getNewToyName());
            name = new UserInput().input();
            if (!name.isEmpty()) {
                flag = true;
            } else {
                System.out.println(UI.getNameError());
            }
        }
        flag = false;
        while (!flag) {
            System.out.println(UI.getNewToyQuantity());
            String input_quantity = new UserInput().input();
            if (isNumeric(input_quantity)) {
                quantity = Integer.parseInt(input_quantity);
                if (quantity > 0) {
                    flag = true;
                } else {
                    System.out.println(UI.getQuantityError());
                }
            } else {
                System.out.println(UI.getQuantityError());
            }
        }
        flag = false;
        while (!flag) {
            System.out.println(UI.getNewToyChance());
            String input_chance = new UserInput().input();
            if (isNumeric(input_chance)) {
                chance = Integer.parseInt(input_chance);
                if (chance > 1 && chance <= 100) {
                    flag = true;
                } else {
                    System.out.println(UI.getChanceError());
                }
            } else {
                System.out.println(UI.getChanceError());
            }
        }
        if (Toys.isEmpty()) {
            Toys.add(new Toy(1, name, quantity, chance));
        }
        else {
            Toys.add(new Toy(Toys.get(Toys.size()-1).getId() + 1, name, quantity, chance));
        }

        try (FileWriter writer = new FileWriter("db.txt", false)) {
            int count = 0;
            while (count < Toys.size()) {
                writer.append(String.format("%d %s %d %d\n", Toys.get(count).getId(), Toys.get(count).getName(),
                        Toys.get(count).getQuantity(), Toys.get(count).getChance()));
                count++;
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}