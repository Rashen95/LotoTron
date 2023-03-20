import java.util.ArrayList;

public class ToyAdder {
    public void add (ArrayList<Toy> Toys) {
        UInterfaceMess UI = new UInterfaceMess();
        String name;
        int quantity;
        int chance;
        boolean flag = false;
        while (!flag){
            System.out.println(UI.getNewToyName());
            name = new UserInput().input();
            if (!name.isEmpty()) {
                flag = true;
            }
            else {
                System.out.println(UI.getNameError());
            }
        }
        flag = false;
        while (!flag) {
            System.out.println(UI.getNewToyQuantity());
            String input_quantity = new UserInput().input();
            if (isNumeric(input_quantity)){
                quantity = Integer.parseInt(input_quantity);
                if (quantity > 0) {
                    flag = true;
                }
                else {
                    System.out.println(UI.getQuantityError());
                }
            }
            else {
                System.out.println(UI.getQuantityError());
            }
        }
        flag = false;
        while (!flag) {
            System.out.println(UI.getNewToyChance());
            String input_chance = new UserInput().input();
            if (isNumeric(input_chance)){
                chance = Integer.parseInt(input_chance);
                if (chance > 1 && chance <= 100) {
                    flag = true;
                }
                else {
                    System.out.println(UI.getChanceError());
                }
            }
            else {
                System.out.println(UI.getChanceError());
            }
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
