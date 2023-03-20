import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Menu {
    public void startMenu() throws FileNotFoundException {
        UInterfaceMess UI = new UInterfaceMess();
        System.out.println(UI.getGreetings());
        new Menu().mainMenu();
    }

    public void mainMenu() throws FileNotFoundException {
        ArrayList<Toy> Toys = new DBreader().read();
        UInterfaceMess UI = new UInterfaceMess();
        boolean flag = false;
        while (!flag) {
            System.out.println(UI.getMenu());
            String change = new UserInput().input();
            switch (change) {
                case "1" -> {
                    flag = true;
                    for (Toy t : Toys) {
                        System.out.println(t.getInformation());
                    }
                    mainMenu();
                }
                case "2" -> {
                    flag = true;
                    new ToyAdder().add(Toys);
                    mainMenu();
                }
                case "3" -> {
                    flag = true;
                    System.out.println(3);
                }
                case "4" -> {
                    flag = true;
                    System.out.println(UI.getExitGame());
                }
                default -> System.out.println(UI.getErrorItemMissing());
            }
        }
    }
}